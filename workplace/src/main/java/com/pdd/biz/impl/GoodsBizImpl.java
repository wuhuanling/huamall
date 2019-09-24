package com.pdd.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdd.biz.GoodsBiz;
import com.pdd.biz.OrderBiz;
import com.pdd.dao.GoodsMapper;
import com.pdd.entity.Goods;

@Service
@Transactional
public class GoodsBizImpl implements GoodsBiz {
@Autowired
private GoodsMapper gm;
	
public GoodsMapper getGm() {
	return gm;
}

public void setGm(GoodsMapper gm) {
	this.gm = gm;
}
@Override
public	List<Goods> getAllGoods(){
	List<Goods> goods = gm.selectAllGoods();
	
	return goods;
	}
}
