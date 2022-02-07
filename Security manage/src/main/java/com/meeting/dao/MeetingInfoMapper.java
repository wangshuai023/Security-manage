package com.meeting.dao;

import com.meeting.model.MeetingInfo;
import com.meeting.model.MeetingInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MeetingInfoMapper {
    long countByExample(MeetingInfoExample example);

    int deleteByExample(MeetingInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeetingInfo record);

    int insertSelective(MeetingInfo record);

    List<MeetingInfo> selectByExample(MeetingInfoExample example);

    MeetingInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    MeetingInfo record, @Param("example")
    MeetingInfoExample example);

    int updateByExample(@Param("record")
    MeetingInfo record, @Param("example")
    MeetingInfoExample example);

    int updateByPrimaryKeySelective(MeetingInfo record);

    int updateByPrimaryKey(MeetingInfo record);
}

