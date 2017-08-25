package com.zyz.bean;

public class College {
    private Integer collid;

    private String collegename;

    public Integer getCollid() {
        return collid;
    }

    public void setCollid(Integer collid) {
        this.collid = collid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }
}