package com.meeting.model;

public class ServiceInfo {
    private Integer id; //ID
    private String serviceName; //设备名
    private Integer roomId; //会议室ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = (serviceName == null) ? null : serviceName.trim();
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}

