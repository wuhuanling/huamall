package com.huamall.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.OrderdetailsBiz;

@CrossOrigin
@RequestMapping("/orderdetails")
@RestController
public class OrderdetailsController {

	private OrderdetailsBiz ob;

	public OrderdetailsBiz getOb() {
		return ob;
	}

	public void setOb(OrderdetailsBiz ob) {
		this.ob = ob;
	}
	
	
}
