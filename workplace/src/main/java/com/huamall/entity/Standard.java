package com.huamall.entity;

public class Standard {
    private Integer standardId;

    private String standardTitle;

    private String standardCode;

    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public String getStandardTitle() {
        return standardTitle;
    }

    public void setStandardTitle(String standardTitle) {
        this.standardTitle = standardTitle == null ? null : standardTitle.trim();
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode == null ? null : standardCode.trim();
    }
}