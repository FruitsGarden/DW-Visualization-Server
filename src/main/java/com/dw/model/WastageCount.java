package com.dw.model;

public class WastageCount {
    private String dt;

    private Long wastageCount;

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public Long getWastageCount() {
        return wastageCount;
    }

    public void setWastageCount(Long wastageCount) {
        this.wastageCount = wastageCount;
    }
}