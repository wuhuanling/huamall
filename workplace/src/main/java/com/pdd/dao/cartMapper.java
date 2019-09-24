package com.pdd.dao;

import com.pdd.entity.cart;

public interface cartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(cart record);

    int insertSelective(cart record);

    cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(cart record);

    int updateByPrimaryKey(cart record);
}