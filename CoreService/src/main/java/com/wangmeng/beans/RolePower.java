package com.wangmeng.beans;

import java.io.Serializable;

public class RolePower  implements Serializable {
    private Long id;

    private Long roleid;

    private Long powerid;

    private String xuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getPowerid() {
        return powerid;
    }

    public void setPowerid(Long powerid) {
        this.powerid = powerid;
    }

    public String getXuid() {
        return xuid;
    }

    public void setXuid(String xuid) {
        this.xuid = xuid == null ? null : xuid.trim();
    }
}