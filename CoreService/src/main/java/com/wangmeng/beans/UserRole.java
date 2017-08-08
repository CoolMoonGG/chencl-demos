package com.wangmeng.beans;

import java.io.Serializable;

public class UserRole  implements Serializable {
    private Long id;

    private Long userid;

    private Long roleid;

    private String xuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getXuid() {
        return xuid;
    }

    public void setXuid(String xuid) {
        this.xuid = xuid == null ? null : xuid.trim();
    }
}