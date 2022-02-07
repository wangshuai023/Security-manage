package com.meeting.service.impl;

import com.meeting.controller.LoginModel;
import com.meeting.dao.AdhocSignGatherMapper;
import com.meeting.service.SignGatherService;
import com.meeting.util.DataListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class  SignGatherServiceImpl implements SignGatherService {
    @Autowired
    AdhocSignGatherMapper adhocSignGatherMapper;
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
      签到统计
    page:当前页数
    login:当前登录账号
    memeetingId:会议ID
    */
    @Override
    public Map<String, Object> signGather(Integer page, LoginModel login,
        Integer memeetingId) {
        Map<String, Object> rs = new HashMap<String, Object>();
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("meetingId", memeetingId);

        List<Map<String, Object>> list = adhocSignGatherMapper.signGather(params); //签到统计

        for (Map<String, Object> adhocMap : list) {
            if (adhocMap.get("col1") != null) {
                adhocMap.put("col1Str",
                    DataListUtils.getSignStatusNameById(
                        adhocMap.get("col1").toString()));
            }
        }

        List<Map<String, Object>> signStatusXList2 = DataListUtils.getSignStatusList(); //x轴为常用数据列表
        rs.put("signStatusXList", signStatusXList2);

        List<Map<String, Object>> rsList1 = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            rsList1.add(map);
        }

        rs.put("rsList1", rsList1);

        return rs;
    }
}

