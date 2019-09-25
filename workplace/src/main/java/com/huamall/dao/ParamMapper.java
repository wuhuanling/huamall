package com.huamall.dao;

import com.huamall.entity.Param;

public interface ParamMapper {
    int deleteByPrimaryKey(Integer paramId);

    int insert(Param record);

    int insertSelective(Param record);

    Param selectByPrimaryKey(Integer paramId);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}