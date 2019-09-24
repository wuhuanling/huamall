package com.pdd.entity;

public class Address {
    private Integer addressId;

    private String addressUname;

    private String addressPhone;

    private String addressAddress;

    private String addressZipcode;

    private Integer addressDefault;

    private Integer addressUid;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressUname() {
        return addressUname;
    }

    public void setAddressUname(String addressUname) {
        this.addressUname = addressUname == null ? null : addressUname.trim();
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone == null ? null : addressPhone.trim();
    }

    public String getAddressAddress() {
        return addressAddress;
    }

    public void setAddressAddress(String addressAddress) {
        this.addressAddress = addressAddress == null ? null : addressAddress.trim();
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode == null ? null : addressZipcode.trim();
    }

    public Integer getAddressDefault() {
        return addressDefault;
    }

    public void setAddressDefault(Integer addressDefault) {
        this.addressDefault = addressDefault;
    }

    public Integer getAddressUid() {
        return addressUid;
    }

    public void setAddressUid(Integer addressUid) {
        this.addressUid = addressUid;
    }
}