package com.dw.model;

public class SilentCount {
    private String dt;

    private Long silentCount;

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public Long getSilentCount() {
        return silentCount;
    }

    public void setSilentCount(Long silentCount) {
        this.silentCount = silentCount;
    }
}