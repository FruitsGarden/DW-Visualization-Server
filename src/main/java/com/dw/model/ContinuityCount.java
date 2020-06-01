package com.dw.model;

public class ContinuityCount {
    private String dt;

    private String wkDt;

    private Long continuityCount;

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

    public Long getContinuityCount() {
        return continuityCount;
    }

    public void setContinuityCount(Long continuityCount) {
        this.continuityCount = continuityCount;
    }
}