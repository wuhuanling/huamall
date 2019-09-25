package com.huamall.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.GoodsBiz;

import com.huamall.dao.GoodsMapper;
import com.huamall.entity.Goods;

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

@Override
public List<Goods> selectGoodsByTypeInfo(String info) {
	// TODO Auto-generated method stub
	return gm.selectGoodsByTypeInfo(info);
}
}
