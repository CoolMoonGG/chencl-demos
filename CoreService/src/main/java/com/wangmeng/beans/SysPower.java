package com.wangmeng.beans;

import java.io.Serializable;
import java.util.Date;

public class SysPower  implements Serializable {
    private Long id;

    private String xuid;

    private String powerName;

    private String redirectUrl;

    private String superid;

    private Short sta;

    private Date createTime;

    private Date modifyTime;

    private String remark;

    private Integer display;

    private Integer sourceType;

    private String ownerSys;

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

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl == null ? null : redirectUrl.trim();
    }

    public String getSuperid() {
        return superid;
    }

    public void setSuperid(String superid) {
        this.superid = superid == null ? null : superid.trim();
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public String getOwnerSys() {
        return ownerSys;
    }

    public void setOwnerSys(String ownerSys) {
        this.ownerSys = ownerSys == null ? null : ownerSys.trim();
    }
}