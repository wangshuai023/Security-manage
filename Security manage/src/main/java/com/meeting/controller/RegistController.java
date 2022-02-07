package com.meeting.controller;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import com.meeting.util.*;
import com.meeting.util.CommonVal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/commonapi")
public class RegistController {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
    @Autowired
    UserInfoMapper userInfoMapper;

    /**
      系统进入注册页面接口
    */
    @RequestMapping(value = "user_info_regist")
    public String user_info_regist(ModelMap modelMap, String msg) {
        modelMap.addAttribute("msg", msg);
        getList(modelMap);

        return "user_info_regist";
    }

    /**
      提交系统注册信息接口
    */
    @RequestMapping("userInfoRegistSubmit")
    @ResponseBody
    public Object userInfoRegistSubmit(String imgCode, String name,
        String password, String realName, String celPhone, Integer sex,
        ModelMap modelMap, HttpServletRequest request,
        HttpServletResponse response) {
        Map<String, Object> rs = new HashMap<String, Object>();
        HttpSession session = request.getSession();

        if ((imgCode != null) &&
                !imgCode.toLowerCase()
                            .equals(request.getSession()
                                               .getAttribute(CommonVal.code)
                                               .toString().toLowerCase())) {
            rs.put("code", 0);
            rs.put("msg",
                "图片验证码错误");

            return rs;
        }

        if ((name == null) || name.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                "请填入登录名");

            return rs;
        }

        if (name != null) {
            UserInfoExample te = new UserInfoExample();
            UserInfoExample.Criteria tc = te.createCriteria();
            tc.andLoginNameEqualTo(name);

            int count = (int) userInfoMapper.countByExample(te);

            if (count > 0) {
                rs.put("code", 0);
                rs.put("msg",
                    "该账号已被注册,请用该账号登录");

                return rs;
            }
        }

        if ((password == null) || password.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                "请填入密码");

            return rs;
        }

        if ((realName == null) || realName.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                "请填入姓名");

            return rs;
        }

        if ((celPhone == null) || celPhone.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                "请填入联系电话");

            return rs;
        }


        if ((celPhone != null) && (celPhone.trim().equals("") == false)) {
            Pattern p = Pattern.compile(
                    "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
            Matcher m = p.matcher(celPhone);

            if (m.matches() == false) {
                ;
                rs.put("code", 0);
                rs.put("msg",
                    "请填入正确的联系电话");

                return rs;
            }
        }

        if (sex == null) {
            rs.put("code", 0);
            rs.put("msg",
                "请填入性别");

            return rs;
        }
/*
        if ((department == null) || department.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                    "请填入所属部室");

            return rs;
        }
        if ((region == null) || region.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                    "请填入所属区域");

            return rs;
        }
        if ((levels == null) || levels.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                    "请填入所属层级");

            return rs;
        }
        if ((post == null) || post.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                    "请填入目前职务");

            return rs;
        }
                if ((group == null) || group.equals("")) {
            rs.put("code", 0);
            rs.put("msg",
                    "请填入所属班组");

            return rs;
        }
 */
        UserInfo model = new UserInfo();
        model.setLoginName(name);
        model.setPassword(password);
        model.setRealName(realName);
        model.setCelPhone(celPhone);
        model.setSex(sex);
        model.setCreateTime(sdf1.format(new Date())); //当前时间格式
        userInfoMapper.insertSelective(model); //注册成功,插入该账号进数据库,并返回提示
        rs.put("code", 1);
        rs.put("msg",
            "注册成功,请使用该账号密码登录");

        return rs;
    }

    public void getList(ModelMap modelMap) {
        modelMap.addAttribute("sexList", DataListUtils.getSexList()); //注册页面需要sex数据列表
    }
}

