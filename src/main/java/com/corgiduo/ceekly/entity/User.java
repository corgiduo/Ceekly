package com.corgiduo.ceekly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;


public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer sex;
    private String nickname;
    private String avatar;
    private String email;
    private Date createDate;
    private Date updateDate;
    private List<Book> bookList;
    private List<Report> reportList;

    public User() {
    }

    public User(Integer id, String username, String password, Integer sex, String nickname,
                String avatar, String email, Date createDate, Date updateDate,
                List<Book> bookList, List<Report> reportList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.nickname = nickname;
        this.avatar = avatar;
        this.email = email;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.bookList = bookList;
        this.reportList = reportList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
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

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Report> getReportList() {
        return reportList;
    }

    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }
}
