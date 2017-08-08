package com.wangmeng.beans;

import java.io.Serializable;

public class SysAtion  implements Serializable {
    private Long id;

    private String percode;

    private String displayname;

    private String actionname;

    private Integer iscontrallor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public Integer getIscontrallor() {
        return iscontrallor;
    }

    public void setIscontrallor(Integer iscontrallor) {
        this.iscontrallor = iscontrallor;
    }
}