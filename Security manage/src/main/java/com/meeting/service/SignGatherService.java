package com.meeting.service;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface SignGatherService {
    /**
      签到统计
    page:当前页数
    login:当前登录账号
    memeetingId:会议ID
    */
    public Map<String, Object> signGather(Integer page, LoginModel login,
        Integer memeetingId);
}

