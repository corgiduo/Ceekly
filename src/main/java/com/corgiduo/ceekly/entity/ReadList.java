package com.corgiduo.ceekly.entity;

import java.util.Date;

public class ReadList {

    private int id;
    private int userId;
    private String title;
    private int status;
    private Date createDate;
    private Date updateDate;

    public ReadList(int id, int userId, String title, int status, Date createDate, Date updateDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.status = status;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
