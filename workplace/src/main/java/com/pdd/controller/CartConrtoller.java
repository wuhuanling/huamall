package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.CartBiz;

@RestController
public class CartConrtoller {

	@Autowired
	private CartBiz cb;

	public CartBiz getCb() {
		return cb;
	}

	public void setCb(CartBiz cb) {
		this.cb = cb;
	}
	
}
