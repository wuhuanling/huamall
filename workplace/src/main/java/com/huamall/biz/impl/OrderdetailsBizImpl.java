package com.huamall.biz.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.OrderdetailsBiz;
import com.huamall.dao.OrderdetailsMapper;

@Transactional
@Service
public class OrderdetailsBizImpl {

	private OrderdetailsMapper om;

	public OrderdetailsMapper getOm() {
		return om;
	}

	public void setOm(OrderdetailsMapper om) {
		this.om = om;
	}
	
}
