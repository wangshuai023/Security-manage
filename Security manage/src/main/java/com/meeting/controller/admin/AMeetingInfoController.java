package com.meeting.controller.admin;

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
@RequestMapping("/admin/meeting_info")
public class AMeetingInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    MeetingInfoService meetingInfoService;
    @Autowired
    AdminInfoMapper adminInfoMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Autowired
    MeetingInfoMapper meetingInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
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
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", adminInfo);

        MeetingInfo model = new MeetingInfo();
        model.setRoomId(roomId);
        modelMap.addAttribute("data", model);
        getList(modelMap, login); //获取数据列表并返回给前台

        return "admin/meeting_info/list";
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

        return meetingInfoService.getDataList(model, page, CommonVal.pageSize,
            login); //分页查询数据
    }

    /**
     进入审核不通过页面
    */
    @RequestMapping("btg")
    public String btg(ModelMap modelMap, MeetingInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台

        MeetingInfo data = meetingInfoMapper.selectByPrimaryKey(model.getId());
        modelMap.addAttribute("data", data);

        return "admin/meeting_info/btg_page";
    }

    /**
     审核不通过提交信息接口
    */
    @RequestMapping("btg_submit")
    @ResponseBody
    public Object btg_submit(MeetingInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = meetingInfoService.btg(model, login); //执行修改操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "审核不通过成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    @RequestMapping(value = "tg")
    @ResponseBody
    public Object tg(Integer id, ModelMap modelMap, HttpServletRequest request,
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

        model.setOrderStatus(2);
        meetingInfoMapper.updateByPrimaryKey(model);

        rs.put("code", 1);
        rs.put("msg",
            "审核通过成功");

        return rs;
    }
}

