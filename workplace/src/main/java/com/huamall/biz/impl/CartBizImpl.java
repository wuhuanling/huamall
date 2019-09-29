package com.huamall.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.CartBiz;
import com.huamall.dao.CartMapper;
import com.huamall.entity.Cart;

@Service
@Transactional
public class CartBizImpl implements CartBiz {

	@Autowired
private	CartMapper cm;
	@Override
	public List<Cart> getAllCart(Integer userId){
		return cm.selectCartsByuid(userId);
	}
}
