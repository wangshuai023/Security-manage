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
public class TaskServiceImpl implements TaskService {
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:00:00");
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    MeetingInfoMapper meetingInfoMapper;
    @Autowired    
    MeetingUserInfoMapper meetingUserInfoMapper;
    @Autowired    
    RoomInfoMapper roomInfoMapper;
    
    @Override
    public void taskService() {
    	MeetingInfoExample me = new MeetingInfoExample();
    	MeetingInfoExample.Criteria mc = me.createCriteria();
       	mc.andOrderStatusNotEqualTo(1);
    	mc.andOrderStatusNotEqualTo(3);
    	mc.andOrderStatusNotEqualTo(5);
    	mc.andOrderStatusNotEqualTo(6);
    	List<MeetingInfo> ml = meetingInfoMapper.selectByExample(me);
    	String now = sdf1.format(new Date());
    	for(MeetingInfo m:ml){//更新会议状态
    		if(m.getOrderTime()!=null&&m.getOrderTime().trim().equals("")==false){
    			String [] split = m.getOrderTime().split(",");
    			
    			String firstTime = m.getOrderDate()+" "+DataListUtils.getOrderTimeNameById(split[0]).split("~")[0].replaceAll("：", ":");//会议开始的时间
    			String lastTime = m.getOrderDate()+" "+DataListUtils.getOrderTimeNameById(split[split.length-1]).split("~")[1].replaceAll("：", ":");//会议结束时间
    			if(m.getOrderStatus()==2){//未到预约时间
        			if(firstTime.compareTo(now)<=0){
        				m.setOrderStatus(4);
        				meetingInfoMapper.updateByPrimaryKeySelective(m);
        			}
    				
        		}else{//使用中状态
        			if(lastTime.compareTo(now)<=0){
        				m.setOrderStatus(5);
        				meetingInfoMapper.updateByPrimaryKeySelective(m);
        			}
        		}
    			
    		}
    		
    	}
    	
    	
    	//更新会议室当前使用状态
    	RoomInfoExample re = new RoomInfoExample();
    	List<RoomInfo> rl =roomInfoMapper.selectByExample(re);
    	for(RoomInfo r:rl){
    		MeetingInfoExample me2 = new MeetingInfoExample();
        	MeetingInfoExample.Criteria mc2 = me2.createCriteria();
           	mc2.andRoomIdEqualTo(r.getId());
           	mc2.andOrderStatusEqualTo(4);
           	int count = (int) meetingInfoMapper.countByExample(me2);
           	if(r.getRoomStatus()==1&&count>0){//从空闲状态变成使用中
           		r.setRoomStatus(2);
           		roomInfoMapper.updateByPrimaryKeySelective(r);
           	}
         	if(r.getRoomStatus()==2&&count==0){//从使用中状态变成空闲状态
           		r.setRoomStatus(1);
           		roomInfoMapper.updateByPrimaryKeySelective(r);
           	}
    	}
    	
    	
    	
    	MeetingUserInfoExample mue = new MeetingUserInfoExample();
    	MeetingUserInfoExample.Criteria muc = mue.createCriteria();
    	muc.andSignStatusEqualTo(1);//只检查待参会状态
    	List<MeetingUserInfo> mul = meetingUserInfoMapper.selectByExample(mue);
    	for(MeetingUserInfo mu:mul){
    		MeetingInfo meeting = meetingInfoMapper.selectByPrimaryKey(mu.getMeetingId());
    		if(meeting.getOrderStatus()==5){
    			mu.setSignStatus(4);
    			meetingUserInfoMapper.updateByPrimaryKeySelective(mu);
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    }
}

