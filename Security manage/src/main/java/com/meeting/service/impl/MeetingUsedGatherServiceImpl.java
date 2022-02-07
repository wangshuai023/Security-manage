package com.meeting.service.impl;

import com.meeting.controller.LoginModel;

import com.meeting.dao.*;

import com.meeting.model.*;

import com.meeting.service.*;

import com.meeting.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStream;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
public class MeetingUsedGatherServiceImpl implements MeetingUsedGatherService {
    @Autowired
    AdhocMeetingUsedGatherMapper adhocMeetingUsedGatherMapper;
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
      会议室统计
    page:当前页数
    login:当前登录账号
    meroomId:会议室ID
    meorderDate1:预约日期(最小值)
    meorderDate2:预约日期(最大值)
    */
    @Override
    public Map<String, Object> roomGather(Integer page, LoginModel login,
        Integer meroomId, String meorderDate1, String meorderDate2) {
        Map<String, Object> rs = new HashMap<String, Object>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("roomId", meroomId);
        params.put("orderDate1", meorderDate1);
        params.put("orderDate2", meorderDate2);
        params.put("orderStatus", 1);
        params.put("orderStatus", 3);
        params.put("orderStatus", 6);

        List<Map<String, Object>> list = adhocMeetingUsedGatherMapper.roomGather(params); //会议室统计

        for (Map<String, Object> adhocMap : list) {
        }

        List<String> orderDateXList = DateCommonUtils.getEchartTimeList(meorderDate1,
                meorderDate2, "yyyy-MM-dd", "yyyy-MM-dd", 3);
        rs.put("orderDateXList", orderDateXList);

        List<Map<String, Object>> rsList1 = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            rsList1.add(map);
        }

        rs.put("rsList1", rsList1);

        return rs;
    }
}

