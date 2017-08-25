package com.zyz.bean;

import java.util.Date;

public class Customback {
    private Integer cbid;

    private String backmessage;

    private String cbstate;

    private Date cbdate;

    private String customername;

    private Integer fkuserid;

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public String getBackmessage() {
        return backmessage;
    }

    public void setBackmessage(String backmessage) {
        this.backmessage = backmessage == null ? null : backmessage.trim();
    }

    public String getCbstate() {
        return cbstate;
    }

    public void setCbstate(String cbstate) {
        this.cbstate = cbstate == null ? null : cbstate.trim();
    }

    public Date getCbdate() {
        return cbdate;
    }

    public void setCbdate(Date cbdate) {
        this.cbdate = cbdate;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Integer getFkuserid() {
        return fkuserid;
    }

    public void setFkuserid(Integer fkuserid) {
        this.fkuserid = fkuserid;
    }
}