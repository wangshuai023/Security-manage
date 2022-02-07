package com.meeting.model;

public class MeetingInfo {
    private Integer id; //ID
    private Integer roomId; //会议室ID
    private Integer userId; //用户ID
    private String meetingName; //会议名
    private String meetingIntro; //会议简介
    private String orderDate; //预约日期
    private String orderTime; //预约时间
    private Integer orderStatus; //预约状态
    private String checkRemark; //审核备注
    private String createTime; //申请时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = (meetingName == null) ? null : meetingName.trim();
    }

    public String getMeetingIntro() {
        return meetingIntro;
    }

    public void setMeetingIntro(String meetingIntro) {
        this.meetingIntro = (meetingIntro == null) ? null : meetingIntro.trim();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = (orderDate == null) ? null : orderDate.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = (orderTime == null) ? null : orderTime.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = (checkRemark == null) ? null : checkRemark.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

