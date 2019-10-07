package com.huamall.biz;

import java.util.List;

import com.huamall.entity.Cart;

public interface CartBiz {

	List<Cart> getAllCart(Integer userId);

	void addCart(Cart cart);

	void updateCart(Cart cart);

	void flushCartCache(Integer cartUid);

}
