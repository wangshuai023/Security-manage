package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface MeetingGatherService {
    /**
      会议统计
    page:当前页数
    login:当前登录账号
    meorderDate1:预约日期(最小值)
    meorderDate2:预约日期(最大值)
    */
    public Map<String, Object> meetingGather(Integer page, LoginModel login,
        String meorderDate1, String meorderDate2);
}

