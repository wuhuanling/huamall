package com.pdd.entity;

public class Storage {
    private Integer storageId;

    private String storageMemoryRunning;

    private String storageMemoryBody;

    private String storageMemoryCard;

    private Integer storageGoodsid;

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public String getStorageMemoryRunning() {
        return storageMemoryRunning;
    }

    public void setStorageMemoryRunning(String storageMemoryRunning) {
        this.storageMemoryRunning = storageMemoryRunning == null ? null : storageMemoryRunning.trim();
    }

    public String getStorageMemoryBody() {
        return storageMemoryBody;
    }

    public void setStorageMemoryBody(String storageMemoryBody) {
        this.storageMemoryBody = storageMemoryBody == null ? null : storageMemoryBody.trim();
    }

    public String getStorageMemoryCard() {
        return storageMemoryCard;
    }

    public void setStorageMemoryCard(String storageMemoryCard) {
        this.storageMemoryCard = storageMemoryCard == null ? null : storageMemoryCard.trim();
    }

    public Integer getStorageGoodsid() {
        return storageGoodsid;
    }

    public void setStorageGoodsid(Integer storageGoodsid) {
        this.storageGoodsid = storageGoodsid;
    }
}