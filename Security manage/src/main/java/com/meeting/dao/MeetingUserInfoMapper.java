package com.meeting.dao;

import com.meeting.model.MeetingUserInfo;
import com.meeting.model.MeetingUserInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MeetingUserInfoMapper {
    long countByExample(MeetingUserInfoExample example);

    int deleteByExample(MeetingUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingUserInfo record);

    int insertSelective(MeetingUserInfo record);

    List<MeetingUserInfo> selectByExample(MeetingUserInfoExample example);

    MeetingUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    MeetingUserInfo record, @Param("example")
    MeetingUserInfoExample example);

    int updateByExample(@Param("record")
    MeetingUserInfo record, @Param("example")
    MeetingUserInfoExample example);

    int updateByPrimaryKeySelective(MeetingUserInfo record);

    int updateByPrimaryKey(MeetingUserInfo record);
}

