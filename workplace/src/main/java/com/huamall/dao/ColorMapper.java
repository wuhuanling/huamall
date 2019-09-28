package com.huamall.dao;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
    
    public String selectColorByCode(@Param("code") String code ); 
}