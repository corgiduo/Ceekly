package com.corgiduo.ceekly.entity;

import java.util.Date;

public class Report {

    private int id;
    private int type;
    private String reportContent;
    private String planContent;
    private Date createDate;
    private Date updateDate;
    private User user;

    public Report(int id, int type, String reportContent, String planContent, Date createDate, Date updateDate, User user) {
        this.id = id;
        this.type = type;
        this.reportContent = reportContent;
        this.planContent = planContent;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
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
