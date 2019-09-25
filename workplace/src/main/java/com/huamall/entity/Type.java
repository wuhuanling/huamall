package com.huamall.entity;

public class Type {
    private Integer typeId;

    private String typeInfo;

    private String typeThumbail;

    private Integer typeParentsid;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo == null ? null : typeInfo.trim();
    }

    public String getTypeThumbail() {
        return typeThumbail;
    }

    public void setTypeThumbail(String typeThumbail) {
        this.typeThumbail = typeThumbail == null ? null : typeThumbail.trim();
    }

    public Integer getTypeParentsid() {
        return typeParentsid;
    }

    public void setTypeParentsid(Integer typeParentsid) {
        this.typeParentsid = typeParentsid;
    }
}