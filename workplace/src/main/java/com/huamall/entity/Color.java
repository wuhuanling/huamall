package com.huamall.entity;

public class Color {
    private Integer colorId;

    private String colorTitle;

    private String colcorCode;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorTitle() {
        return colorTitle;
    }

    public void setColorTitle(String colorTitle) {
        this.colorTitle = colorTitle == null ? null : colorTitle.trim();
    }

    public String getColcorCode() {
        return colcorCode;
    }

    public void setColcorCode(String colcorCode) {
        this.colcorCode = colcorCode == null ? null : colcorCode.trim();
    }
}