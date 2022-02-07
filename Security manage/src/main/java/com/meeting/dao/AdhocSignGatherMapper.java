package com.meeting.dao;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import java.io.InputStream;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface AdhocSignGatherMapper {
    /**
      签到统计
    */
    public List<Map<String, Object>> signGather(Map<String, Object> params); //签到统计
}

