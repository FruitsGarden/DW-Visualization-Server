package com.dw.model;

public class NewMidCount {
    private String createDate;

    private Long newMidCount;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public Long getNewMidCount() {
        return newMidCount;
    }

    public void setNewMidCount(Long newMidCount) {
        this.newMidCount = newMidCount;
    }
}