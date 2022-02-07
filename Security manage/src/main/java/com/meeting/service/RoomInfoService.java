package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface RoomInfoService {
    /**
      分页查询会议室数据列表
    */
    public Map<String, Object> getDataList(RoomInfo queryModel, Integer page,
        Integer pageSize, LoginModel login);

    /**
      封装会议室为前台展示的数据形式
    */
    public Map<String, Object> getRoomInfoModel(RoomInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(RoomInfo model, LoginModel login);

    /**
      修改
    */
    public String update(RoomInfo model, LoginModel login);
}

