package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.GoodsBiz;

@RestController
public class GoodsController {

	@Autowired
	private GoodsBiz gb;

	public GoodsBiz getGb() {
		return gb;
	}

	public void setGb(GoodsBiz gb) {
		this.gb = gb;
	}
	
}
