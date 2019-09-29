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

    private String cartGoodsTitle;

    @Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartUid=" + cartUid + ", cartGoodsId=" + cartGoodsId + ", cartNum="
				+ cartNum + ", cartStatus=" + cartStatus + ", cartCreateTime=" + cartCreateTime + ", cartUpdateTime="
				+ cartUpdateTime + ", cartGoodsTitle=" + cartGoodsTitle + "]";
	}

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

    public String getCartGoodsTitle() {
        return cartGoodsTitle;
    }

    public void setCartGoodsTitle(String cartGoodsTitle) {
        this.cartGoodsTitle = cartGoodsTitle == null ? null : cartGoodsTitle.trim();
    }
}