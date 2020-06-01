package com.dw.model;

public class BackCount {
    private String dt;

    private String wkDt;

    private Long wastageCount;

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public String getWkDt() {
        return wkDt;
    }

    public void setWkDt(String wkDt) {
        this.wkDt = wkDt == null ? null : wkDt.trim();
    }

    public Long getWastageCount() {
        return wastageCount;
    }

    public void setWastageCount(Long wastageCount) {
        this.wastageCount = wastageCount;
    }
}