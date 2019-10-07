package com.huamall.dao;

import java.util.List;

import com.huamall.entity.Cart;

import tk.mybatis.mapper.common.Mapper;

public interface CartMapper  {
    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
  List<Cart> selectCartsByuid(Integer userId);
//    Cart selectByUidAndSku(Integer userId ,String detail);
  
}