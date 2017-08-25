package com.zyz.bean;

import java.util.Date;

public class Sell {
    private Integer sellid;

    private String address;

    private String goodname;

    private Date selldate;

    private String selldesc;

    private Float totalfrice;

    private Integer fkuserid;

    private Integer sellnumber;

    public Integer getSellid() {
        return sellid;
    }

    public void setSellid(Integer sellid) {
        this.sellid = sellid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Date getSelldate() {
        return selldate;
    }

    public void setSelldate(Date selldate) {
        this.selldate = selldate;
    }

    public String getSelldesc() {
        return selldesc;
    }

    public void setSelldesc(String selldesc) {
        this.selldesc = selldesc == null ? null : selldesc.trim();
    }

    public Float getTotalfrice() {
        return totalfrice;
    }

    public void setTotalfrice(Float totalfrice) {
        this.totalfrice = totalfrice;
    }

    public Integer getFkuserid() {
        return fkuserid;
    }

    public void setFkuserid(Integer fkuserid) {
        this.fkuserid = fkuserid;
    }

    public Integer getSellnumber() {
        return sellnumber;
    }

    public void setSellnumber(Integer sellnumber) {
        this.sellnumber = sellnumber;
    }
}