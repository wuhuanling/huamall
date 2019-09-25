package com.huamall.entity;

import java.util.Date;

public class Cart {
    private Integer cartId;

    private Integer cartUid;

    private Integer cartGoodsId;

    private Integer cartNum;

    private Integer cartStatus;

    private Date cartCreateTime;

    private Date cartUpdateTime;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartUid() {
        return cartUid;
    }

    public void setCartUid(Integer cartUid) {
        this.cartUid = cartUid;
    }

    public Integer getCartGoodsId() {
        return cartGoodsId;
    }

    public void setCartGoodsId(Integer cartGoodsId) {
        this.cartGoodsId = cartGoodsId;
    }

    public Integer getCartNum() {
        return cartNum;
    }

    public void setCartNum(Integer cartNum) {
        this.cartNum = cartNum;
    }

    public Integer getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(Integer cartStatus) {
        this.cartStatus = cartStatus;
    }

    public Date getCartCreateTime() {
        return cartCreateTime;
    }

    public void setCartCreateTime(Date cartCreateTime) {
        this.cartCreateTime = cartCreateTime;
    }

    public Date getCartUpdateTime() {
        return cartUpdateTime;
    }

    public void setCartUpdateTime(Date cartUpdateTime) {
        this.cartUpdateTime = cartUpdateTime;
    }
}