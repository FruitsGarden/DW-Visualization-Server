package com.dw.model;

import java.math.BigDecimal;

public class UserConvert {
    private String dt;

    private Long uvMCount;

    private Long newMCount;

    private BigDecimal newMRatio;

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public Long getUvMCount() {
        return uvMCount;
    }

    public void setUvMCount(Long uvMCount) {
        this.uvMCount = uvMCount;
    }

    public Long getNewMCount() {
        return newMCount;
    }

    public void setNewMCount(Long newMCount) {
        this.newMCount = newMCount;
    }

    public BigDecimal getNewMRatio() {
        return newMRatio;
    }

    public void setNewMRatio(BigDecimal newMRatio) {
        this.newMRatio = newMRatio;
    }
}