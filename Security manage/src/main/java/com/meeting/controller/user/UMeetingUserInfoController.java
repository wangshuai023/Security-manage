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
@RequestMapping("/user/meeting_user_info")
public class UMeetingUserInfoController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd HH:00:00");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    MeetingUserInfoService meetingUserInfoService;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    MeetingInfoMapper meetingInfoMapper;
    @Autowired
    MeetingUserInfoMapper meetingUserInfoMapper;

    public void getList(ModelMap modelMap, LoginModel login) {
        UserInfoExample userInfoE = new UserInfoExample();
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoE);
        List<Map<String, Object>> userInfoList2 = new ArrayList<Map<String, Object>>();

        for (UserInfo m : userInfoList) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", m.getId());
            map.put("name", m.getLoginName());
            userInfoList2.add(map);
        }

        modelMap.addAttribute("userInfoList", userInfoList2);
        modelMap.addAttribute("signStatusList",
            DataListUtils.getSignStatusList()); //返回sign_status列表
        
    }

    /**
     * 返回参会人员列表jsp页面
    */
    @RequestMapping(value = "")
    public String index(ModelMap modelMap, Integer meetingId, Integer userId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //获取当前登录账号信息
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(login.getId());
        modelMap.addAttribute("user", userInfo);

        MeetingUserInfo model = new MeetingUserInfo();
        model.setMeetingId(meetingId);
        model.setUserId(userId);
        modelMap.addAttribute("data", model);
        getList(modelMap, login); //获取数据列表并返回给前台

        
        MeetingInfo meeting = meetingInfoMapper.selectByPrimaryKey(meetingId);
        int isFQ=0;//是否发起人
        if(meeting!=null&&meeting.getUserId().equals(login.getId())){
        	isFQ=1;
        }
        modelMap.addAttribute("isFQ", isFQ);
        
        return "user/meeting_user_info/list";
    }

    /**
     * 根据查询条件分页查询参会人员数据,然后返回给前台渲染
    */
    @RequestMapping(value = "queryList")
    @ResponseBody
    public Object toList(MeetingUserInfo model, Integer page,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        return meetingUserInfoService.getDataList(model, page,
            CommonVal.pageSize, login); //分页查询数据
    }

    /**
     进入添加参会人员页面
    */
    @RequestMapping("add")
    public String add(ModelMap modelMap, MeetingUserInfo model,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName); //从session中获取当前登录账号	
        getList(modelMap, login); //获取前台需要用到的数据列表并返回给前台
        modelMap.addAttribute("data", model);

        return "user/meeting_user_info/add_page";
    }

    /**
     添加参会人员提交信息接口
    */
    @RequestMapping("add_submit")
    @ResponseBody
    public Object add_submit(MeetingUserInfo model, ModelMap modelMap,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String msg = meetingUserInfoService.add(model, login); //执行添加操作

        if (msg.equals("")) {
            rs.put("code", 1);
            rs.put("msg",
                "添加参会人员成功");

            return rs;
        }

        rs.put("code", 0);
        rs.put("msg", msg);

        return rs;
    }

    /**
     删除参会人员接口
    */
    @RequestMapping("del")
    @ResponseBody
    public Object del(Integer id, ModelMap modelMap, HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        meetingUserInfoService.delete(id);
        rs.put("code", 1);
        rs.put("msg",
            "删除成功");

        return rs;
    }

    @RequestMapping(value = "sign")
    @ResponseBody
    public Object sign(Integer id, ModelMap modelMap,
        HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> rs = new HashMap<String, Object>();
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        MeetingUserInfo model = meetingUserInfoMapper.selectByPrimaryKey(id);

        if (model == null) {
            rs.put("code", 0);
            rs.put("msg",
                "该参会人员已不存在");

            return rs;
        }
        String now = sdf1.format(new Date());
        String now1 = sdf11.format(new Date());
        Integer min = Integer.parseInt(now.split(" ")[1].split(":")[1]);//当前是多少分的

    	if(model.getOrderTime()!=null&&model.getOrderTime().trim().equals("")==false){
			String [] split = model.getOrderTime().split(",");
			
			String firstTime = model.getOrderDate()+" "+DataListUtils.getOrderTimeNameById(split[0]).split("~")[0].replaceAll("：", ":");//会议开始的时间
			String lastTime = model.getOrderDate()+" "+DataListUtils.getOrderTimeNameById(split[split.length-1]).split("~")[1].replaceAll("：", ":");//会议结束时间
			if(firstTime.compareTo(now1)==0){
                model.setSignStatus(2);
			}else if(firstTime.compareTo(now1)>0){//会议未开始
				rs.put("code", 0);
	            rs.put("msg","会议未开始");
	            return rs;
			}else{
				if(lastTime.compareTo(now)<0){//缺勤
					model.setSignStatus(4);
				}else{
				    if(min<=5){
                        model.setSignStatus(2);//出席
                    }else{
                        model.setSignStatus(3);//迟到
                    }

				}
			}
		}
        meetingUserInfoMapper.updateByPrimaryKey(model);
        rs.put("code", 1);
        rs.put("msg",
            "签到成功");

        return rs;
    }

    /**
     * 生成导入人员导入excel模板
    */
    @RequestMapping(value = "import_user_model")
    public void import_user_model(HttpServletResponse response,
        HttpServletRequest request) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); // 空数据模板
        PoiExcelExport pee = new PoiExcelExport(response,
                "导入人员模板",
                "sheet1");
        String[] headers = {
                "会议发起人(必填)"
            };
        String[] columns = { "meetingUserId" };
        int[] titleSize = { 20 };

        try {
            pee.wirteExcel(columns, headers, titleSize,
                new ArrayList<Map<String, Object>>()); //生成excel
            response.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 批量导入数据的接口,解析上传的excel中的数据,将数据批量插入到数据库中
    **/
    @RequestMapping(value = "import_user", method = RequestMethod.POST)
    @ResponseBody
    public Object importUser(@RequestParam
    MultipartFile file, ModelMap modelMap, HttpServletRequest request,
        MeetingUserInfo model, HttpServletResponse response)
        throws IOException {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        Map<String, Object> rs = new HashMap<String, Object>();
        String data = meetingUserInfoService.importUser(file.getInputStream(),
                file.getOriginalFilename(), login, model); // 导入数据

        if (!data.equals("")) {
            rs.put("code", 0);
            rs.put("msg", data);

            return rs;
        } else {
            rs.put("code", 1);
            rs.put("msg",
                "导入人员成功");

            return rs;
        }
    }
}

