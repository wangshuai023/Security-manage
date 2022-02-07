package com.meeting.dao;

import com.meeting.model.ServiceInfo;
import com.meeting.model.ServiceInfoExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ServiceInfoMapper {
    long countByExample(ServiceInfoExample example);

    int deleteByExample(ServiceInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    ServiceInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
    ServiceInfo record, @Param("example")
    ServiceInfoExample example);

    int updateByExample(@Param("record")
    ServiceInfo record, @Param("example")
    ServiceInfoExample example);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);
}

