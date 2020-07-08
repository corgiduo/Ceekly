package com.corgiduo.ceekly.entity;

import java.util.Date;
import java.util.List;

public class User {

    private int id;
    private String username;
    private String password;
    private int sex;
    private String nickname;
    private String avatar;
    private String email;
    private Date createDate;
    private Date updateDate;
    private List<Read> readList;
    private List<Report> reportList;

    public User(int id, String username, String password, int sex, String nickname,
                String avatar, String email, Date createDate, Date updateDate,
                List<Read> readList, List<Report> reportList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.nickname = nickname;
        this.avatar = avatar;
        this.email = email;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.readList = readList;
        this.reportList = reportList;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Read> getReadList() {
        return readList;
    }

    public void setReadList(List<Read> readList) {
        this.readList = readList;
    }

    public List<Report> getReportList() {
        return reportList;
    }

    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }
}
