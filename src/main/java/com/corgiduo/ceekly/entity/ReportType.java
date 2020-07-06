package com.corgiduo.ceekly.entity;

import java.util.Date;

public class ReportType {

    private int id;
    private String type;
    private Date createDate;
    private Date updateDate;

    public ReportType(int id, String type, Date createDate, Date updateDate) {
        this.id = id;
        this.type = type;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
