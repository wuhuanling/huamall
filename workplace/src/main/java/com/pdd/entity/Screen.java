package com.pdd.entity;

public class Screen {
    private Integer screenId;

    private String screenSize;

    private String screenScreenColor;

    private String screenScreenType;

    private String screenResolution;

    private String screenTouchScreen;

    private String screenPixelDensity;

    private Integer screenGoodsid;

    public Integer getScreenId() {
        return screenId;
    }

    public void setScreenId(Integer screenId) {
        this.screenId = screenId;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize == null ? null : screenSize.trim();
    }

    public String getScreenScreenColor() {
        return screenScreenColor;
    }

    public void setScreenScreenColor(String screenScreenColor) {
        this.screenScreenColor = screenScreenColor == null ? null : screenScreenColor.trim();
    }

    public String getScreenScreenType() {
        return screenScreenType;
    }

    public void setScreenScreenType(String screenScreenType) {
        this.screenScreenType = screenScreenType == null ? null : screenScreenType.trim();
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution == null ? null : screenResolution.trim();
    }

    public String getScreenTouchScreen() {
        return screenTouchScreen;
    }

    public void setScreenTouchScreen(String screenTouchScreen) {
        this.screenTouchScreen = screenTouchScreen == null ? null : screenTouchScreen.trim();
    }

    public String getScreenPixelDensity() {
        return screenPixelDensity;
    }

    public void setScreenPixelDensity(String screenPixelDensity) {
        this.screenPixelDensity = screenPixelDensity == null ? null : screenPixelDensity.trim();
    }

    public Integer getScreenGoodsid() {
        return screenGoodsid;
    }

    public void setScreenGoodsid(Integer screenGoodsid) {
        this.screenGoodsid = screenGoodsid;
    }
}