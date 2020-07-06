package com.corgiduo.ceekly.entity;

import java.util.Date;

public class User {

    private int id;
    private String username;
    private String password;
    private Date createDate;
    private Date updateDate;

    public User(int id, String username, String password, Date createDate, Date updateDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
