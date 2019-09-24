package com.pdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.GoodsBiz;
import com.pdd.entity.Goods;

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
	
	@RequestMapping("/goodsList")
	public List<Goods> getGoodsList(){
	
		return   gb.getAllGoods();
	}
}
