package com.zyz.bean;

import java.util.Date;

public class Tsi {
    private Long id;

    private Integer tsi;

    private String definition;

    private String appl;

    private Integer tsiPoint;

    private String io;

    private String location;

    private Integer flag;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTsi() {
        return tsi;
    }

    public void setTsi(Integer tsi) {
        this.tsi = tsi;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getAppl() {
        return appl;
    }

    public void setAppl(String appl) {
        this.appl = appl;
    }

    public Integer getTsiPoint() {
        return tsiPoint;
    }

    public void setTsiPoint(Integer tsiPoint) {
        this.tsiPoint = tsiPoint;
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}