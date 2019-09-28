package com.huamall.dao;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Transmission;

public interface TransmissionMapper {
    int deleteByPrimaryKey(Integer transmissionId);

    int insert(Transmission record);

    int insertSelective(Transmission record);

    Transmission selectByPrimaryKey(Integer transmissionId);

    int updateByPrimaryKeySelective(Transmission record);

    int updateByPrimaryKey(Transmission record);
    
    public String selectTransmissionByGoodstitle(@Param("title") String title ); 
}