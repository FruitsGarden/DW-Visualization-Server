package com.dw.model;

public class CategoryStat {
    private String tmId;

    private String category1Id;

    private String category1Name;

    private Long buycount;

    private Long buyTwiceLast;

    private Long buyTwiceLastRatio;

    private Long buy3timesLast;

    private Long buy3timesLastRatio;

    private String statMn;

    private String statDate;

    public String getTmId() {
        return tmId;
    }

    public void setTmId(String tmId) {
        this.tmId = tmId == null ? null : tmId.trim();
    }

    public String getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(String category1Id) {
        this.category1Id = category1Id == null ? null : category1Id.trim();
    }

    public String getCategory1Name() {
        return category1Name;
    }

    public void setCategory1Name(String category1Name) {
        this.category1Name = category1Name == null ? null : category1Name.trim();
    }

    public Long getBuycount() {
        return buycount;
    }

    public void setBuycount(Long buycount) {
        this.buycount = buycount;
    }

    public Long getBuyTwiceLast() {
        return buyTwiceLast;
    }

    public void setBuyTwiceLast(Long buyTwiceLast) {
        this.buyTwiceLast = buyTwiceLast;
    }

    public Long getBuyTwiceLastRatio() {
        return buyTwiceLastRatio;
    }

    public void setBuyTwiceLastRatio(Long buyTwiceLastRatio) {
        this.buyTwiceLastRatio = buyTwiceLastRatio;
    }

    public Long getBuy3timesLast() {
        return buy3timesLast;
    }

    public void setBuy3timesLast(Long buy3timesLast) {
        this.buy3timesLast = buy3timesLast;
    }

    public Long getBuy3timesLastRatio() {
        return buy3timesLastRatio;
    }

    public void setBuy3timesLastRatio(Long buy3timesLastRatio) {
        this.buy3timesLastRatio = buy3timesLastRatio;
    }

    public String getStatMn() {
        return statMn;
    }

    public void setStatMn(String statMn) {
        this.statMn = statMn == null ? null : statMn.trim();
    }

    public String getStatDate() {
        return statDate;
    }

    public void setStatDate(String statDate) {
        this.statDate = statDate == null ? null : statDate.trim();
    }
}