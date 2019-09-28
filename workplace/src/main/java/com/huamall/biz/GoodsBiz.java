package com.huamall.biz;

import java.util.List;

import com.huamall.entity.Goods;

public interface GoodsBiz {

	List<Goods> getAllGoods();
	
	 public List<Goods> selectGoodsByTypeInfo(String info);
	 
	 public Goods selectGoodsByTitle(String title );
	 
	 
}
