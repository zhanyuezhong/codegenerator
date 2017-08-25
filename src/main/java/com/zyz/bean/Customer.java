package com.zyz.bean;

import java.util.Date;

public class Customer {
    private Integer cusid;

    private String address;

    private Date birthday;

    private String cusdesc;

    private String hobby;

    private String idcard;

    private String phone;

    private String realname;

    private String sex;

    private String work;

    private Integer fktypeid;

    private Integer fkuserid;

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCusdesc() {
        return cusdesc;
    }

    public void setCusdesc(String cusdesc) {
        this.cusdesc = cusdesc == null ? null : cusdesc.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public Integer getFktypeid() {
        return fktypeid;
    }

    public void setFktypeid(Integer fktypeid) {
        this.fktypeid = fktypeid;
    }

    public Integer getFkuserid() {
        return fkuserid;
    }

    public void setFkuserid(Integer fkuserid) {
        this.fkuserid = fkuserid;
    }
}