package com.wangmeng.beans;

import java.io.Serializable;
import java.util.Date;

public class SysRole  implements Serializable {
    private Long id;

    private String xuid;

    private String roleName;

    private String remark;

    private Short sta;

    private Date createTime;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getSta() {
        return sta;
    }

    public void setSta(Short sta) {
        this.sta = sta;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}