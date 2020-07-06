package com.corgiduo.ceekly.entity;

import java.util.Date;

public class Plan {

    private int id;
    private int reportId;
    private String content;
    private Date createDate;
    private Date updateDate;

    public Plan(int id, int reportId, String content, Date createDate, Date updateDate) {
        this.id = id;
        this.reportId = reportId;
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

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
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
