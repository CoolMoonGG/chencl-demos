package com.wangmeng.beans;

import java.io.Serializable;
import java.util.Date;

public class Opratelog  implements Serializable {
    private Long id;

    private Integer userid;

    private String username;

    private String pagename;

    private String action;

    private String actiondescript;

    private String contents;

    private Date opereadate;

    private String ipaddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActiondescript() {
        return actiondescript;
    }

    public void setActiondescript(String actiondescript) {
        this.actiondescript = actiondescript == null ? null : actiondescript.trim();
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
    }

    public Date getOpereadate() {
        return opereadate;
    }

    public void setOpereadate(Date opereadate) {
        this.opereadate = opereadate;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }
}