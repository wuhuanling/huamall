package com.huamall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.OrderBiz;
import com.huamall.entity.Order;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderBiz ob;

	public OrderBiz getOb() {
		return ob;
	}

	public void setOb(OrderBiz ob) {
		this.ob = ob;
	}

	@GetMapping("/orders")
	public List<Order> getAllOrdersById(@RequestParam("userid") int userid) {
		System.out.println(userid);
		return ob.getAllOrdersById(userid);
	}
	
}
