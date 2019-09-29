package com.huamall.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.CartBiz;
import com.huamall.entity.Cart;
import com.huamall.entity.Users;
@CrossOrigin
@RestController
public class CartConrtoller {

	@Autowired
	private CartBiz cb;

@RequestMapping(value = "/cart" )
	public  String addToCart(@RequestBody(required = false) Cart cart) {
		//前端将想加入购物车的商品信息穿过来
		System.out.println(cart);
		List<Cart> cartList=new ArrayList<Cart>();
		return null;
	}
	

}
