package com.corgiduo.ceekly.entity;

import java.util.Date;

public class Report {

    private int id;
    private int typeId;
    private int userId;
    private String content;
    private Date createDate;
    private Date updateDate;

    public Report(int id, int typeId, int userId, String content, Date createDate, Date updateDate) {
        this.id = id;
        this.typeId = typeId;
        this.userId = userId;
        this.content = content;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
