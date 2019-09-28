package com.huamall.dao;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Screen;

public interface ScreenMapper {
    int deleteByPrimaryKey(Integer screenId);

    int insert(Screen record);

    int insertSelective(Screen record);

    Screen selectByPrimaryKey(Integer screenId);

    int updateByPrimaryKeySelective(Screen record);

    int updateByPrimaryKey(Screen record);
    
    public String selectScreenByGoodstitle(@Param("title") String title);
}