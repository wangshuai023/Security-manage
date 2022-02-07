package com.meeting.model;

public class RoomInfo {
    private Integer id; //ID
    private String roomName; //会议室名
    private String roomAddress; //地址
    private Integer roomStatus; //当前状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = (roomName == null) ? null : roomName.trim();
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = (roomAddress == null) ? null : roomAddress.trim();
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }
}

