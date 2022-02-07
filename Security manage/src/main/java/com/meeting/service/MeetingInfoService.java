package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface MeetingInfoService {
    /**
      分页查询会议数据列表
    */
    public Map<String, Object> getDataList(MeetingInfo queryModel,
        Integer page, Integer pageSize, LoginModel login);

    /**
      封装会议为前台展示的数据形式
    */
    public Map<String, Object> getMeetingInfoModel(MeetingInfo model,
        LoginModel login);

    /**
      预约会议室
    */
    public String orderMeeting(MeetingInfo model, LoginModel login);

    /**
      审核不通过
    */
    public String btg(MeetingInfo model, LoginModel login);
}

