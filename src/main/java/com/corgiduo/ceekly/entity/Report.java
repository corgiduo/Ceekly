package com.corgiduo.ceekly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;


public class Report {

    private Integer id;
    private Integer type;
    private String reportContent;
    private String planContent;
    private Date createDate;
    private Date updateDate;
    private User user;

    public Report() {
    }

    public Report(Integer id, Integer type, String reportContent, String planContent, Date createDate, Date updateDate, User user) {
        this.id = id;
        this.type = type;
        this.reportContent = reportContent;
        this.planContent = planContent;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
