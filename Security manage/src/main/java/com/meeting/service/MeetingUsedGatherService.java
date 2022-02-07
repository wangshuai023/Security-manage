package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface MeetingUsedGatherService {
    /**
      会议室统计
    page:当前页数
    login:当前登录账号
    meroomId:会议室ID
    meorderDate1:预约日期(最小值)
    meorderDate2:预约日期(最大值)
    */
    public Map<String, Object> roomGather(Integer page, LoginModel login,
        Integer meroomId, String meorderDate1, String meorderDate2);
}

