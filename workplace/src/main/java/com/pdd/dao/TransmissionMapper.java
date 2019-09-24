package com.pdd.dao;

import com.pdd.entity.Transmission;

public interface TransmissionMapper {
    int deleteByPrimaryKey(Integer transmissionId);

    int insert(Transmission record);

    int insertSelective(Transmission record);

    Transmission selectByPrimaryKey(Integer transmissionId);

    int updateByPrimaryKeySelective(Transmission record);

    int updateByPrimaryKey(Transmission record);
}