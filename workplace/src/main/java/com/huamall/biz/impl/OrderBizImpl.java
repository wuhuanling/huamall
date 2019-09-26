package com.huamall.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.OrderBiz;
import com.huamall.dao.OrderMapper;
import com.huamall.entity.Order;

@Service
@Transactional
public class OrderBizImpl implements OrderBiz {
	@Autowired
	private OrderMapper om;

	public OrderMapper getOm() {
		return om;
	}

	public void setOm(OrderMapper om) {
		this.om = om;
	}

	@Override
	public List<Order> getAllOrdersById(int userid) {
		// TODO Auto-generated method stub
		return om.selectAllOrdersById(userid);
	}
}
