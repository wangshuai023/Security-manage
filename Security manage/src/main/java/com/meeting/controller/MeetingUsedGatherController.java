package com.meeting.controller;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import com.meeting.service.*;
import com.meeting.service.impl.*;

import com.meeting.util.*;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/commonapi/meetingUsedGather")
public class MeetingUsedGatherController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    MeetingUsedGatherService meetingUsedGatherService;

    /**
    进入会议室使用统计页面
    */
    @RequestMapping(value = "meetingUsedGather")
    public String MeetingUsedGather(Integer rid, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        if (login == null) {
            modelMap.addAttribute("msg",
                "尚未登录");

            return "error";
        }

        modelMap.addAttribute("rid", rid);

        return "meeting_used_gather";
    }

    /**
      提交会议室统计信息接口
    */
    @RequestMapping(value = "roomGatherSubmit")
    @ResponseBody
    public Object roomGatherSubmit(Integer page, Integer meroomId,
        String meorderDate1, String meorderDate2, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        if (login == null) {
            return null;
        }

        return meetingUsedGatherService.roomGather(page, login, meroomId,
            meorderDate1, meorderDate2);
    }
}

