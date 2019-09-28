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

@Override
public Goods selectGoodsByTitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectGoodsByTitle(title);
}

@Override
public String selectColorByCode(String code) {
	// TODO Auto-generated method stub
	return gm.selectColorByCode(code);
}

@Override
public String selectStandardByCode(String code) {
	// TODO Auto-generated method stub
	return gm.selectStandardByCode(code);
}

@Override
public String selectParamByGoodstitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectParamByGoodstitle(title);
}

@Override
public String selectScreenByGoodstitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectScreenByGoodstitle(title);
}

@Override
public String selectStorageByGoodstitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectStorageByGoodstitle(title);
}

@Override
public String selectTransmissionByGoodstitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectTransmissionByGoodstitle(title);
}

@Override
public String selectShootingByGoodstitle(String title) {
	// TODO Auto-generated method stub
	return gm.selectShootingByGoodstitle(title);
}
}
