package com.meeting.service.impl;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import com.meeting.service.*;

import com.meeting.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.InputStream;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class MeetingInfoServiceImpl implements MeetingInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    MeetingInfoMapper meetingInfoMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    SysSettingInfoMapper sysSettingInfoMapper;

    /**
      预约会议室
    */
    @Override
    public String orderMeeting(MeetingInfo model, LoginModel login) {
        if ((model.getMeetingName() == null) ||
                model.getMeetingName().equals("")) {
            return "会议名为必填属性";
        }

        if ((model.getMeetingIntro() == null) ||
                model.getMeetingIntro().equals("")) {
            return "会议简介为必填属性";
        }

        if ((model.getOrderDate() == null) || model.getOrderDate().equals("")) {
            return "预约日期为必填属性";
        }

        if ((model.getOrderTime() == null) || model.getOrderTime().equals("")) {
            return "预约时间为必填属性";
        }
        
        if(model.getOrderDate().compareTo(sdf2.format(new Date()))<0){
        	return "预约日期不能小于当前日期";
        }
        String [] split = model.getOrderTime().split(",");
        MeetingInfoExample me = new MeetingInfoExample();
        MeetingInfoExample.Criteria mc = me.createCriteria();
        mc.andOrderStatusNotEqualTo(3);
        mc.andOrderStatusNotEqualTo(5);
        mc.andOrderStatusNotEqualTo(6);
        mc.andOrderDateEqualTo(model.getOrderDate());
        mc.andRoomIdEqualTo(model.getRoomId());
        List<MeetingInfo> ml = meetingInfoMapper.selectByExample(me);
        for(MeetingInfo m:ml){
        	for(String str:split){
        		if(str.trim().equals("")==false){
        			if(m.getOrderTime().contains(str+",")||m.getOrderTime().contains(","+str)||m.getOrderTime().equals(""+str)){
        				return "该日期的"+DataListUtils.getOrderTimeNameById(str)+"时段已被预约";
        			}	
        		}
        		
        	}
        }
        
        
        
        
        SysSettingInfoExample se = new SysSettingInfoExample();
        List<SysSettingInfo> sl = sysSettingInfoMapper.selectByExample(se);
        if(sl.size()==0||sl.get(0).getOrderModel()==2){
        	  model.setOrderStatus(1); //默认已预约,
        }else{
        	  model.setOrderStatus(2); //审核通过,
        	  model.setCheckRemark("系统自动审核");
        }

        model.setUserId(login.getId()); //登录id
        
      
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        meetingInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      审核不通过
    */
    @Override
    public String btg(MeetingInfo model, LoginModel login) {
        MeetingInfo preModel = meetingInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getCheckRemark() == null) ||
                model.getCheckRemark().equals("")) {
            return "审核备注为必填属性";
        }

        preModel.setOrderStatus(3); //预约状态设置为审核不通过
        preModel.setCheckRemark(model.getCheckRemark());
        meetingInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询会议列表数据
    */
    @Override
    public Map<String, Object> getDataList(MeetingInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        MeetingInfoExample se = new MeetingInfoExample();
        MeetingInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("order_status asc,id desc"); //默认按照id倒序排序

        if (queryModel.getRoomId() != null) {
            sc.andRoomIdEqualTo(queryModel.getRoomId());
        }

        if ((queryModel.getMeetingName() != null) &&
                (queryModel.getMeetingName().equals("") == false)) {
            sc.andMeetingNameLike("%" + queryModel.getMeetingName() + "%"); //模糊查询
        }

        if (queryModel.getOrderStatus() != null) {
            sc.andOrderStatusEqualTo(queryModel.getOrderStatus()); //查询预约状态等于指定值
        }

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }

        int count = (int) meetingInfoMapper.countByExample(se);
        int totalPage = 0;

        if ((page != null) && (pageSize != null)) { //分页

            if ((count > 0) && ((count % pageSize) == 0)) {
                totalPage = count / pageSize;
            } else {
                totalPage = (count / pageSize) + 1;
            }

            se.setPageRows(pageSize);
            se.setStartRow((page - 1) * pageSize);
        }

        List<MeetingInfo> list = meetingInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (MeetingInfo model : list) {
            list2.add(getMeetingInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装会议为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getMeetingInfoModel(MeetingInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("meetingInfo", model);

        if (model.getRoomId() != null) {
            RoomInfo roomInfo = roomInfoMapper.selectByPrimaryKey(model.getRoomId()); //会议室ID为外接字段,需要关联会议室来解释该字段

            if (roomInfo != null) {
                map.put("roomIdStr", roomInfo.getRoomName());
            }
        }

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //用户ID为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("userIdStr", userInfo.getLoginName());
            }
        }

        map.put("orderTimeStr",
            DataListUtils.getOrderTimeNameById(model.getOrderTime() + "")); //解释预约时间字段
        map.put("orderStatusStr",
            DataListUtils.getOrderStatusNameById(model.getOrderStatus() + "")); //解释预约状态字段

        return map;
    }
}

