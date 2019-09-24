package com.pdd.entity;

public class Image {
    private Integer imageId;

    private String imageImg;

    private Integer imageGoodsid;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageImg() {
        return imageImg;
    }

    public void setImageImg(String imageImg) {
        this.imageImg = imageImg == null ? null : imageImg.trim();
    }

    public Integer getImageGoodsid() {
        return imageGoodsid;
    }

    public void setImageGoodsid(Integer imageGoodsid) {
        this.imageGoodsid = imageGoodsid;
    }
}