package com.huamall.biz;

import java.util.List;

import com.huamall.entity.Cart;

public interface CartBiz {

	List<Cart> getAllCart(Integer userId);

}
