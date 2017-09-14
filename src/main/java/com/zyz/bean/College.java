package com.zyz.bean;

import net.sf.oval.constraint.NotBlank;

public class College {
    private Integer collid;
    @NotBlank(message = "专业名称不能为空！")
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