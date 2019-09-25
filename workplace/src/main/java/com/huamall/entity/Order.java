package com.huamall.entity;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer orderNum;

    private Date orderCreatetime;

    private String orderPaystatus;

    private String orderFreight;

    private Date orderPaytime;

    private Integer orderAddressid;

    private Integer orderUserid;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public String getOrderPaystatus() {
        return orderPaystatus;
    }

    public void setOrderPaystatus(String orderPaystatus) {
        this.orderPaystatus = orderPaystatus == null ? null : orderPaystatus.trim();
    }

    public String getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(String orderFreight) {
        this.orderFreight = orderFreight == null ? null : orderFreight.trim();
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public Integer getOrderAddressid() {
        return orderAddressid;
    }

    public void setOrderAddressid(Integer orderAddressid) {
        this.orderAddressid = orderAddressid;
    }

    public Integer getOrderUserid() {
        return orderUserid;
    }

    public void setOrderUserid(Integer orderUserid) {
        this.orderUserid = orderUserid;
    }
}