package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface MeetingUserInfoService {
    /**
      分页查询参会人员数据列表
    */
    public Map<String, Object> getDataList(MeetingUserInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装参会人员为前台展示的数据形式
    */
    public Map<String, Object> getMeetingUserInfoModel(MeetingUserInfo model,
        LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      添加参会人员
    */
    public String add(MeetingUserInfo model, LoginModel login);

    /**
    **导入参会人员数据,根据传入的excel,得到传入数据,然后做值的校验并导入系统
    */
    public String importUser(InputStream is, String fileName, LoginModel login,
        MeetingUserInfo pageModel);
}

