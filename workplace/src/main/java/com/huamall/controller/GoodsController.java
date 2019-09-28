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
	
	@GetMapping("/{code}")
	 public String selectColorByCode(@PathVariable(value = "code") String code ) {
		 System.out.println();
		 return gb.selectColorByCode(code);
	 }
	 
	@GetMapping("/{code}")
	 public String selectStandardByCode(@PathVariable(value = "code") String code) {
		 System.out.println();
		 return gb.selectStandardByCode(code);
	 }
	
	
	@GetMapping("/{title}")
	 public String selectParamByGoodstitle(@PathVariable(value = "title") String title) {
		 System.out.println();
		 return gb.selectParamByGoodstitle(title);
	 }
	   
	@GetMapping("/{title}")
	 public String selectScreenByGoodstitle(@PathVariable(value = "title") String title) {
		 System.out.println();
		 return gb.selectScreenByGoodstitle(title);
	 }
	 
	@GetMapping("/{title}")
	 public String selectStorageByGoodstitle(@PathVariable(value = "title") String title ) {
		 System.out.println();
		 return gb.selectStorageByGoodstitle(title);
	 }
	 
	@GetMapping("/{title}")
	 public String selectTransmissionByGoodstitle(@PathVariable(value = "title") String title ) {
		 System.out.println();
		 return gb.selectTransmissionByGoodstitle(title);
	 }
	 
	@GetMapping("/{title}")
	 public String selectShootingByGoodstitle(@PathVariable(value = "title") String title) {
		 System.out.println();
		 return gb.selectShootingByGoodstitle(title);
	 }
	
	
}
