package com.meeting.model;

public class UserInfo {
    private Integer id; //ID
    private String loginName; //登录名
    private String password; //密码
    private String realName; //姓名
    private String celPhone; //联系电话
    private Integer sex; //性别
    private String department; //部室
    private String region; //区域
    private String levels; //层级
    private String banzu; //班组
    private String post; //职务
    private String createTime; //注册时间


    public UserInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = (loginName == null) ? null : loginName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = (password == null) ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = (realName == null) ? null : realName.trim();
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = (celPhone == null) ? null : celPhone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {this.department = (department == null) ? null : department.trim();}
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = (region == null) ? null : region.trim();
    }
    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = (levels == null) ? null : levels.trim();
    }
    public String getBanzu() {
        return banzu;
    }

    public void setBanzu(String banzu) {
        this.banzu = (banzu == null) ? null : banzu.trim();
    }


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = (post == null) ? null : post.trim();
    }
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = (createTime == null) ? null : createTime.trim();
    }
}

