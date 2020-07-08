package com.corgiduo.ceekly.entity;

import java.util.Date;
import java.util.List;

public class User {

    private int id;
    private String username;
    private String password;
    private Date createDate;
    private Date updateDate;
    private UserInfo userInfo;
    private List<ReadList> readList;

    public User(String username, String password, Date createDate, Date updateDate, UserInfo userInfo, List<ReadList> readList) {
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.userInfo = userInfo;
        this.readList = readList;
    }

    public User(int id, String username, String password, Date createDate,
                Date updateDate, UserInfo userInfo, List<ReadList> readList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.userInfo = userInfo;
        this.readList = readList;
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

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<ReadList> getReadList() {
        return readList;
    }

    public void setReadList(List<ReadList> readList) {
        this.readList = readList;
    }
}
