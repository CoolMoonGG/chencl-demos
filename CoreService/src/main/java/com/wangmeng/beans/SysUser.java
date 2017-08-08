package com.wangmeng.beans;

import java.io.Serializable;
import java.util.Date;

public class SysUser  implements Serializable {
    private Long id;

    private String xuid;

    private Integer userType;

    private String userName;

    private String userPwd;

    private String cellphone;

    private String realName;

    private Date createTime;

    private String email;

    private Short sta;

    private Date lastLoginTime;

    private Date lastLogoutTime;

    private String regionName;

    private String authPasswd;

    private Short remind;

    private String msgsend;

    public String getMsgsend() {
        return msgsend;
    }

    public void setMsgsend(String msgsend) {
        this.msgsend = msgsend;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getXuid() {
        return xuid;
    }

    public void setXuid(String xuid) {
        this.xuid = xuid == null ? null : xuid.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getSta() {
        return sta;
    }

    public void setSta(Short sta) {
        this.sta = sta;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getAuthPasswd() {
        return authPasswd;
    }

    public void setAuthPasswd(String authPasswd) {
        this.authPasswd = authPasswd == null ? null : authPasswd.trim();
    }

    public Short getRemind() {
        return remind;
    }

    public void setRemind(Short remind) {
        this.remind = remind;
    }
}