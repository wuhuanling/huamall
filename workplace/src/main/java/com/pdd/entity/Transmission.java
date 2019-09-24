package com.pdd.entity;

public class Transmission {
    private Integer transmissionId;

    private String transmissionWlan;

    private String transmissionWlanProtocol;

    private String transmissionWlanFrequency;

    private String transmissionBluetooth;

    private String transmissionRemoteInfrared;

    private String transmissionGps;

    private String transmissionScreening;

    private Integer transmissionGoodsid;

    public Integer getTransmissionId() {
        return transmissionId;
    }

    public void setTransmissionId(Integer transmissionId) {
        this.transmissionId = transmissionId;
    }

    public String getTransmissionWlan() {
        return transmissionWlan;
    }

    public void setTransmissionWlan(String transmissionWlan) {
        this.transmissionWlan = transmissionWlan == null ? null : transmissionWlan.trim();
    }

    public String getTransmissionWlanProtocol() {
        return transmissionWlanProtocol;
    }

    public void setTransmissionWlanProtocol(String transmissionWlanProtocol) {
        this.transmissionWlanProtocol = transmissionWlanProtocol == null ? null : transmissionWlanProtocol.trim();
    }

    public String getTransmissionWlanFrequency() {
        return transmissionWlanFrequency;
    }

    public void setTransmissionWlanFrequency(String transmissionWlanFrequency) {
        this.transmissionWlanFrequency = transmissionWlanFrequency == null ? null : transmissionWlanFrequency.trim();
    }

    public String getTransmissionBluetooth() {
        return transmissionBluetooth;
    }

    public void setTransmissionBluetooth(String transmissionBluetooth) {
        this.transmissionBluetooth = transmissionBluetooth == null ? null : transmissionBluetooth.trim();
    }

    public String getTransmissionRemoteInfrared() {
        return transmissionRemoteInfrared;
    }

    public void setTransmissionRemoteInfrared(String transmissionRemoteInfrared) {
        this.transmissionRemoteInfrared = transmissionRemoteInfrared == null ? null : transmissionRemoteInfrared.trim();
    }

    public String getTransmissionGps() {
        return transmissionGps;
    }

    public void setTransmissionGps(String transmissionGps) {
        this.transmissionGps = transmissionGps == null ? null : transmissionGps.trim();
    }

    public String getTransmissionScreening() {
        return transmissionScreening;
    }

    public void setTransmissionScreening(String transmissionScreening) {
        this.transmissionScreening = transmissionScreening == null ? null : transmissionScreening.trim();
    }

    public Integer getTransmissionGoodsid() {
        return transmissionGoodsid;
    }

    public void setTransmissionGoodsid(Integer transmissionGoodsid) {
        this.transmissionGoodsid = transmissionGoodsid;
    }
}