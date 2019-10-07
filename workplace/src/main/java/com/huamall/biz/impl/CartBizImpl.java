package com.huamall.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.huamall.biz.CartBiz;
import com.huamall.dao.CartMapper;
import com.huamall.entity.Cart;
import com.huamall.util.RedisUtil;

import redis.clients.jedis.Jedis;

@Service
@Transactional
public class CartBizImpl implements CartBiz {

	@Autowired
private	CartMapper cm;
	@Autowired 
private	RedisUtil redisUtil;
	
	@Override
	public List<Cart> getAllCart(Integer userId){
		return cm.selectCartsByuid(userId);
	}
	@Override
	public void addCart(Cart cart) {
		cm.insertSelective(cart);
		
	}

	public CartMapper getCm() {
		return cm;
	}

	public void setCm(CartMapper cm) {
		this.cm = cm;
	}
	
	public RedisUtil getRedisUtil() {
		return redisUtil;
	}
	public void setRedisUtil(RedisUtil redisUtil) {
		this.redisUtil = redisUtil;
	}
	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
		cm.updateByPrimaryKeySelective(cart);
	}
	@Override
	public void flushCartCache(Integer cartUid) {
		// TODO Auto-generated method stub
		Cart c=new Cart();
				c.setCartUid(cartUid);
		List<Cart> cartList = cm.selectCartsByuid(cartUid);
		//tongbu到缓存中去
		Jedis jedis = redisUtil.getJedis();
		
		
		Map<String, String> map=new HashMap<String, String>();
		for (Cart cart : cartList) {
			map.put(cart.getCartGoodsTitle(),JSON.toJSONString(cart));
		}
		jedis.hmset("user:"+cartUid+":cart", map);
		
		
		jedis.close();
	}
	
}

