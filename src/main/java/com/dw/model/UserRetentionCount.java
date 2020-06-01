package com.dw.model;

public class UserRetentionCount {
    private String createDate;

    private Integer retentionDay;

    private Long retentionCount;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public Integer getRetentionDay() {
        return retentionDay;
    }

    public void setRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
    }

    public Long getRetentionCount() {
        return retentionCount;
    }

    public void setRetentionCount(Long retentionCount) {
        this.retentionCount = retentionCount;
    }
}