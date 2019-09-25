package com.huamall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    public List<Type> selectChildByInfo(@Param("info") String info);
}