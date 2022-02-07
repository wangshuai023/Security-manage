package com.meeting.controller.user;

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
@RequestMapping("/user/meeting_info")
public class UMeetingInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    MeetingInfoService meetingInfoService;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Autowired
    MeetingInfoMapper meetingInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        modelMap.addAttribute("orderTimeList", DataListUtils.getOrderTimeList()); //返回order_time列表
        modelMap.addAttribute("orderStatusList",
            DataListUtils.getOrderStatusList()); //返回order_status列表
    }

    /**
     * 返回会议列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer roomId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", userInfo);

        MeetingInfo model = new MeetingInfo();
        model.setRoomId(roomId);
        modelMap.addAttribute("data", model);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "user/meeting_info/list";
    }

    /**
     * 根据查询条件分页查询会议数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(MeetingInfo model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        model.setUserId(login.getId()); //用户ID等于当前登录id

        return meetingInfoService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入预约会议室页面
    */
    @RequestMapping("order_meeting")
    public String order_meeting(ModelMap modelMap, MeetingInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台
        modelMap.addAttribute("data", model);

        return "user/meeting_info/order_meeting_page";
    }

    /**
     预约会议室提交信息接口
    */
    @RequestMapping("order_meeting_submit")
    @ResponseBody
    public Object order_meeting_submit(MeetingInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = meetingInfoService.orderMeeting(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "预约会议室成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    @RequestMapping(value = "qx")
    @ResponseBody
    public Object qx(Integer id, ModelMap modelMap, HttpServletRequest request,
        HttpServletResponse response) {
        Map<String, Object> rs = new HashMap<String, Object>();
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        MeetingInfo model = meetingInfoMapper.selectByPrimaryKey(id);

        if (model == null) {
            rs.put("code", 0);
            rs.put("msg",
                "该会议已不存在");

            return rs;
        }

        model.setOrderStatus(6);
        meetingInfoMapper.updateByPrimaryKey(model);
        rs.put("code", 1);
        rs.put("msg",
            "取消会议成功");

        return rs;
    }
}

