package com.huamall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.GoodsBiz;
import com.huamall.entity.Goods;


@CrossOrigin
@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsBiz gb;

	public GoodsBiz getGb() {
		return gb;
	}

	public void setGb(GoodsBiz gb) {
		this.gb = gb;
	}

	@GetMapping("/")
	public List<Goods> getGoodsList(){
		return   gb.getAllGoods();
	}
	
	@GetMapping("/{info}")
	public  List<Goods> selectGoodsByTypeInfo(@PathVariable(value = "info") String info){
		System.out.println(info);
		return gb.selectGoodsByTypeInfo(info);
	}
	
	
	
	@GetMapping("/{title}")
	public Goods selectGoodsByTitle(@PathVariable(value = "title") String title) {
		System.out.println();
		return gb.selectGoodsByTitle(title);
	}
	

}
