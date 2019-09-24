package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.OrderBiz;

@RestController
public class OrderController {

	@Autowired
	private OrderBiz ob;

	public OrderBiz getOb() {
		return ob;
	}

	public void setOb(OrderBiz ob) {
		this.ob = ob;
	}
	
}
