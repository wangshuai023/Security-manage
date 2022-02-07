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
public class ServiceInfoServiceImpl implements ServiceInfoService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    ServiceInfoMapper serviceInfoMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;

    /**
      新增
    */
    @Override
    public String add(ServiceInfo model, LoginModel login) {
        if ((model.getServiceName() == null) ||
                model.getServiceName().equals("")) {
            return "设备名为必填属性";
        }

        serviceInfoMapper.insertSelective(model); //插入数据

        return "";
    }

    /**
      修改
    */
    @Override
    public String update(ServiceInfo model, LoginModel login) {
        ServiceInfo preModel = serviceInfoMapper.selectByPrimaryKey(model.getId());

        if ((model.getServiceName() == null) ||
                model.getServiceName().equals("")) {
            return "设备名为必填属性";
        }

        preModel.setServiceName(model.getServiceName());
        serviceInfoMapper.updateByPrimaryKey(preModel); //更新数据

        return "";
    }

    /**
    *根据参数查询会议室设备列表数据
    */
    @Override
    public Map<String, Object> getDataList(ServiceInfo queryModel,
        Integer page, Integer pageSize, LoginModel login) {
        ServiceInfoExample se = new ServiceInfoExample();
        ServiceInfoExample.Criteria sc = se.createCriteria();
        se.setOrderByClause("id desc"); //默认按照id倒序排序

        if (queryModel.getRoomId() != null) {
            sc.andRoomIdEqualTo(queryModel.getRoomId());
        }

        int count = (int) serviceInfoMapper.countByExample(se);
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

        List<ServiceInfo> list = serviceInfoMapper.selectByExample(se); //执行查询语句
        Map<String, Object> rs = new HashMap<String, Object>();
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();

        for (ServiceInfo model : list) {
            list2.add(getServiceInfoModel(model, login));
        }

        rs.put("list", list2); //数据列表
        rs.put("count", count); //数据总数
        rs.put("totalPage", totalPage); //总页数

        return rs;
    }

    /**
      封装会议室设备为前台展示的数据形式
    */
    @Override
    public Map<String, Object> getServiceInfoModel(ServiceInfo model,
        LoginModel login) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("serviceInfo", model);

        if (model.getRoomId() != null) {
            RoomInfo roomInfo = roomInfoMapper.selectByPrimaryKey(model.getRoomId()); //会议室ID为外接字段,需要关联会议室来解释该字段

            if (roomInfo != null) {
                map.put("roomIdStr", roomInfo.getRoomName());
            }
        }

        return map;
    }

    /**
    * 删除数据
    */
    @Override
    public void delete(Integer id) {
        serviceInfoMapper.deleteByPrimaryKey(id);
    }
}

