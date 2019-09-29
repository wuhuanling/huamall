package com.huamall.dao;

import com.huamall.entity.Orderdetails;

public interface OrderdetailsMapper {
    int deleteByPrimaryKey(Integer orderdetailsId);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    Orderdetails selectByPrimaryKey(Integer orderdetailsId);

    int updateByPrimaryKeySelective(Orderdetails record);

    int updateByPrimaryKey(Orderdetails record);
}