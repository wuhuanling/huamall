package com.huamall.entity;

public class Shooting {
    private Integer shootingId;

    private String shootingRearCamera;

    private String shootingFrontCamera;

    private String shootingFlash;

    private String shootingVideoShooting;

    private String shootingZoomMode;

    private String shootingPhotoResolution;

    private String shootingShootingFunction;

    private Integer shootingGoodsid;

    public Integer getShootingId() {
        return shootingId;
    }

    public void setShootingId(Integer shootingId) {
        this.shootingId = shootingId;
    }

    public String getShootingRearCamera() {
        return shootingRearCamera;
    }

    public void setShootingRearCamera(String shootingRearCamera) {
        this.shootingRearCamera = shootingRearCamera == null ? null : shootingRearCamera.trim();
    }

    public String getShootingFrontCamera() {
        return shootingFrontCamera;
    }

    public void setShootingFrontCamera(String shootingFrontCamera) {
        this.shootingFrontCamera = shootingFrontCamera == null ? null : shootingFrontCamera.trim();
    }

    public String getShootingFlash() {
        return shootingFlash;
    }

    public void setShootingFlash(String shootingFlash) {
        this.shootingFlash = shootingFlash == null ? null : shootingFlash.trim();
    }

    public String getShootingVideoShooting() {
        return shootingVideoShooting;
    }

    public void setShootingVideoShooting(String shootingVideoShooting) {
        this.shootingVideoShooting = shootingVideoShooting == null ? null : shootingVideoShooting.trim();
    }

    public String getShootingZoomMode() {
        return shootingZoomMode;
    }

    public void setShootingZoomMode(String shootingZoomMode) {
        this.shootingZoomMode = shootingZoomMode == null ? null : shootingZoomMode.trim();
    }

    public String getShootingPhotoResolution() {
        return shootingPhotoResolution;
    }

    public void setShootingPhotoResolution(String shootingPhotoResolution) {
        this.shootingPhotoResolution = shootingPhotoResolution == null ? null : shootingPhotoResolution.trim();
    }

    public String getShootingShootingFunction() {
        return shootingShootingFunction;
    }

    public void setShootingShootingFunction(String shootingShootingFunction) {
        this.shootingShootingFunction = shootingShootingFunction == null ? null : shootingShootingFunction.trim();
    }

    public Integer getShootingGoodsid() {
        return shootingGoodsid;
    }

    public void setShootingGoodsid(Integer shootingGoodsid) {
        this.shootingGoodsid = shootingGoodsid;
    }
}