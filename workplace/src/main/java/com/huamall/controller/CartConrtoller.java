package com.huamall.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.huamall.biz.CartBiz;
import com.huamall.entity.Cart;
import com.huamall.util.CookieUtil;
@CrossOrigin
@RestController
public class CartConrtoller {

	@Autowired
	private CartBiz cb;

@RequestMapping(value = "/cart" )
	public  String addToCart(@RequestBody(required = false) Cart cart,HttpServletRequest request,HttpServletResponse response)  {
		//前端将想加入购物车的商品信息穿过来
		System.out.println(cart);
		cart.setCartCreateTime(new Date());
		cart.setCartUpdateTime(new Date());
		List<Cart> cartList=new ArrayList<Cart>();
		
		if(cart.getCartUid()==null) {
			System.out.println("未登录");
		
			
			String cartListCookie = CookieUtil.getCookieValue(request, "cartListCookie",true);
			
				if(cartListCookie==null ||cartListCookie=="") {
                      //cookie空
					cartList.add(cart);
				}else {
					
					cartList = JSON.parseArray(cartListCookie,Cart.class);
					
					if(isContain(cartList,cart)) {
						//如果有这个商品，更新数量
						for (Cart cartItem : cartList) {
							if(cartItem!=null) {
							if(cartItem.getCartGoodsTitle()==cart.getCartGoodsTitle()) {
								cartItem.setCartNum(cartItem.getCartNum()+cart.getCartNum());
								
							}
							}
						}
						
					}else {
//						没有就往里添加
						cartList.add(cart);	
					}

				}
				//往cookie中更新购物车中的商品
				CookieUtil.setCookie(request, response, "cartListCookie", JSON.toJSONString(cartList), 60*60*72 ,true);
				}else {
//					登陆了
				
					cartList = cb.getAllCart(cart.getCartUid());
					if(cartList==null) {
						//db购物车为空
						System.out.println("空");
						cb.addCart(cart);
					}else {
						//db购物车不空
						System.out.println("不空");
						//判断是否重复添加
						if(isContain(cartList, cart)) {
							//执行更新操作
							System.out.println("更新");
							Cart c = getCartId(cartList, cart);
							cart.setCartId(c.getCartId());
							cart.setCartNum(c.getCartNum()+cart.getCartNum());
							System.out.println(cart);
							cb.updateCart(cart );
						}else {
							//添加操作
							cb.addCart(cart);
						}
						//同步缓存
						cb.flushCartCache(cart.getCartUid());
						
					}
					
				}

		
		String s = CookieUtil.getCookieValue(request, "cartListCookie",true);
		 List<Cart> parseArray = JSON.parseArray(s,Cart.class);
		System.out.println(parseArray);
		
		return s;
	}

private boolean isContain(List<Cart> cartList, Cart cart) {
	// TODO Auto-generated method stub
	for (Cart c : cartList) {
		if(c!=null) {
		if(c.getCartGoodsTitle().equals(cart.getCartGoodsTitle())) {
		return true	;
		}
		}
	}
	
	return false;
}

private Cart getCartId(List<Cart> cartList, Cart cart) {
	// TODO Auto-generated method stub
	for (Cart c : cartList) {
		if(c!=null) {
		if(c.getCartGoodsTitle().equals(cart.getCartGoodsTitle())) {
		return c	;
		}
		}
	}
	
	return null;
}

public CartBiz getCb() {
	return cb;
}

public void setCb(CartBiz cb) {
	this.cb = cb;
}
	

}
