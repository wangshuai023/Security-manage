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
public class MeetingUserInfoServiceImpl implements MeetingUserInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    MeetingUserInfoMapper meetingUserInfoMapper;
    @Autowired
    MeetingInfoMapper meetingInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;

    /**
      添加参会人员
    */
    @Override
    public String add(MeetingUserInfo model, LoginModel login) {
        if (model.getUserId() == null) {
            return "参会人员为必填属性";
        }

        model.setSignStatus(1); //默认待参会,
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式

        MeetingInfo meetingInfo = meetingInfoMapper.selectByPrimaryKey(model.getMeetingId()); //查询会议供以下填入其他字段
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //查询用户供以下填入其他字段

        if (meetingInfo != null) {
            model.setMeetingUserId(meetingInfo.getUserId());
        }

        if (userInfo != null) {
            model.setUserName(userInfo.getRealName());
        }

        if (userInfo != null) {
            model.setUserCel(userInfo.getCelPhone());
        }

        if (meetingInfo != null) {
            model.setOrderDate(meetingInfo.getOrderDate());
        }

        if (meetingInfo != null) {
            model.setOrderTime(meetingInfo.getOrderTime());
        }
        MeetingUserInfoExample mue = new MeetingUserInfoExample();
        MeetingUserInfoExample.Criteria muc = mue.createCriteria();
        muc.andMeetingIdEqualTo(model.getMeetingId());
        muc.andUserIdEqualTo(model.getUserId());
        int count = (int) meetingUserInfoMapper.countByExample(mue);
        if(count>0){
        	return "该会议已录入“"+userInfo.getLoginName()+"”该参会人员";
        }
        meetingUserInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
    *根据参数查询参会人员列表数据
    */
    @Override
    public Map<String, Object> getDataList(MeetingUserInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        MeetingUserInfoExample se = new MeetingUserInfoExample();
        MeetingUserInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getUserId() != null) {
            sc.andUserIdEqualTo(queryModel.getUserId());
        }

        if (queryModel.getMeetingId() != null) {
            sc.andMeetingIdEqualTo(queryModel.getMeetingId());
        }

        if (queryModel.getSignStatus() != null) {
            sc.andSignStatusEqualTo(queryModel.getSignStatus()); //查询签到状态等于指定值
        }

        int count = (int) meetingUserInfoMapper.countByExample(se);
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

        List<MeetingUserInfo> list = meetingUserInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (MeetingUserInfo model : list) {
            list2.add(getMeetingUserInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装参会人员为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getMeetingUserInfoModel(MeetingUserInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("meetingUserInfo", model);

        if (model.getMeetingId() != null) {
            MeetingInfo meetingInfo = meetingInfoMapper.selectByPrimaryKey(model.getMeetingId()); //会议ID为外接字段,需要关联会议来解释该字段

            if (meetingInfo != null) {
                map.put("meetingIdStr", meetingInfo.getMeetingName());
            }
        }

        if (model.getMeetingUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getMeetingUserId()); //会议发起人为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("meetingUserIdStr", userInfo.getLoginName());
            }
        }

        if (model.getUserId() != null) {
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //参会人员为外接字段,需要关联用户来解释该字段

            if (userInfo != null) {
                map.put("userIdStr", userInfo.getLoginName());
            }
        }

        map.put("orderTimeStr",
            DataListUtils.getOrderTimeNameById(model.getOrderTime() + "")); //解释会议时间字段
        map.put("signStatusStr",
            DataListUtils.getSignStatusNameById(model.getSignStatus() + "")); //解释签到状态字段

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        meetingUserInfoMapper.deleteByPrimaryKey(id);
    }

    /**
    **导入参会人员数据,根据传入的excel,得到传入数据,然后做值的校验并导入系统
    */
    @Override
    public String importUser(InputStream is, String fileName, LoginModel login,
        MeetingUserInfo pageModel) {
        String result = "";
        ExcelUtil eu = new ExcelUtil();
        eu.setStartReadPos(1); //定位读取excel的第一行 

        List<Map<Integer, Object>> list = eu.readExcelData(is, fileName); //读取excel数据到list中
        List<MeetingUserInfo> addList = new ArrayList<MeetingUserInfo>();

        for (int i = 0; i < list.size(); i++) {
            Map<Integer, Object> m = list.get(i);
            MeetingUserInfo model = new MeetingUserInfo();
            //默认赋值
            model.setSignStatus(1); //默认待参会,
            model.setCreateTime(sdf1.format(new Date())); //当前时间格式

            Object val1 = m.get(1); //字段:会议发起人

            if ((val1 == null) || val1.toString().trim().equals("")) {
                return "第" + (i + 1) +
                "行数据中,参会人员不能为空";
            }

            if (val1 != null) {
                String tmpStr = val1.toString();

                if (tmpStr.equals("") == false) {
                    UserInfoExample te = new UserInfoExample();
                    UserInfoExample.Criteria tc = te.createCriteria();
                    tc.andLoginNameEqualTo(tmpStr);

                    List<UserInfo> tl = userInfoMapper.selectByExample(te); //查询用户是否存在该数据

                    if (tl.size() == 1) {
                        model.setUserId(tl.get(0).getId()); //
                    }
                }
            }

            addList.add(model);
        }
        for (int k = 0; k < addList.size(); k++) {
        	
        	  for (int g = 0; g < addList.size(); g++) {
              	
              	if(addList.get(k).getUserId().equals(addList.get(g).getUserId())&&k!=g){//有相同的人员
              		UserInfo user = userInfoMapper.selectByPrimaryKey(addList.get(g).getUserId());
              		
              		return "该excel录入两条“"+user.getLoginName()+"”数据";
              	}
              	
              }
        	
        }
        for (int k = 0; k < addList.size(); k++) {
            MeetingUserInfo model = addList.get(k);

            if (model.getUserId() == null) {
                return "excel中第" + (k + 1) +
                "行中参会人员列不能为空";
            }
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(model.getUserId()); //查询用户供以下填入其他字段
            MeetingUserInfoExample mue = new MeetingUserInfoExample();
            
            MeetingUserInfoExample.Criteria muc = mue.createCriteria();
            muc.andMeetingIdEqualTo(pageModel.getMeetingId());
            muc.andUserIdEqualTo(model.getUserId());
            int count = (int) meetingUserInfoMapper.countByExample(mue);
            if(count>0){
            	
            	return "该会议已录入“"+userInfo.getLoginName()+"”该参会人员";
            }
            model.setMeetingId(pageModel.getMeetingId());

            MeetingInfo meetingInfo = meetingInfoMapper.selectByPrimaryKey(model.getMeetingId()); //查询会议供以下填入其他字段
         

            if (meetingInfo != null) {
                model.setMeetingUserId(meetingInfo.getUserId());
            }

            if (userInfo != null) {
                model.setUserName(userInfo.getRealName());
            }

            if (userInfo != null) {
                model.setUserCel(userInfo.getCelPhone());
            }

            if (meetingInfo != null) {
                model.setOrderDate(meetingInfo.getOrderDate());
            }

            if (meetingInfo != null) {
                model.setOrderTime(meetingInfo.getOrderTime());
            }
        }

        for (int k = 0; k < addList.size(); k++) {
            meetingUserInfoMapper.insertSelective(addList.get(k));
        }

        return "";
    }
}

