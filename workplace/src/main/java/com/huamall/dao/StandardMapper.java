package com.huamall.dao;

import com.huamall.entity.Standard;

public interface StandardMapper {
    int deleteByPrimaryKey(Integer standardId);

    int insert(Standard record);

    int insertSelective(Standard record);

    Standard selectByPrimaryKey(Integer standardId);

    int updateByPrimaryKeySelective(Standard record);

    int updateByPrimaryKey(Standard record);
}