package com.meeting.model;

public class MeetingUserInfo {
    private Integer id; //ID
    private Integer meetingId; //会议ID
    private Integer userId; //参会人员
    private String orderDate; //会议日期
    private String orderTime; //会议时间
    private String userName; //姓名
    private String userCel; //用户手机号
    private Integer meetingUserId; //会议发起人
    private Integer signStatus; //签到状态
    private String createTime; //发起时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = (userName == null) ? null : userName.trim();
    }

    public String getUserCel() {
        return userCel;
    }

    public void setUserCel(String userCel) {
        this.userCel = (userCel == null) ? null : userCel.trim();
    }

    public Integer getMeetingUserId() {
        return meetingUserId;
    }

    public void setMeetingUserId(Integer meetingUserId) {
        this.meetingUserId = meetingUserId;
    }

    public Integer getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

