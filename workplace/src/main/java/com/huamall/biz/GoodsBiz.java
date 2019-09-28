package com.huamall.biz;

import java.util.List;

import com.huamall.entity.Goods;

public interface GoodsBiz {

	List<Goods> getAllGoods();
	
	 public List<Goods> selectGoodsByTypeInfo(String info);
	 
	 public Goods selectGoodsByTitle(String title );
	 
	 public String selectColorByCode(String code ); 
	    
	 public String selectStandardByCode(String code);

	 public String selectParamByGoodstitle(String title);
	    
	 public String selectScreenByGoodstitle(String title);
	    
	 public String selectStorageByGoodstitle(String title );
	    
	 public String selectTransmissionByGoodstitle(String title ); 
	    
	 public String selectShootingByGoodstitle(String title);
}
