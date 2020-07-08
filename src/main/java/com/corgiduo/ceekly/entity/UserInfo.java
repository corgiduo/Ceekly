package com.corgiduo.ceekly.entity;

import java.util.Date;

public class UserInfo {

    private int id;
    private String nickname;
    private String email;
    private int sex;
    private String avatar;
    private Date createDate;
    private Date updateDate;

    public UserInfo(String nickname, String email, String avatar, Date createDate, Date updateDate) {
        this.nickname = nickname;
        this.email = email;
        this.avatar = avatar;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public UserInfo(String nickname, String email, int sex, String avatar, Date createDate, Date updateDate) {
        this.nickname = nickname;
        this.email = email;
        this.sex = sex;
        this.avatar = avatar;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public UserInfo(int id, String nickname, String email, int sex, String avatar, Date createDate, Date updateDate) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.sex = sex;
        this.avatar = avatar;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
