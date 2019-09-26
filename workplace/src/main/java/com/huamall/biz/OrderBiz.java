package com.huamall.biz;

import java.util.List;

import com.huamall.entity.Order;

public interface OrderBiz {
	List<Order> getAllOrdersById(int userid);
}
