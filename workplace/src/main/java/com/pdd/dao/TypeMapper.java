package com.pdd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pdd.entity.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
    
    public List<Type> selectChileByInfo(@Param("info") String info);
}