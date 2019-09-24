package com.pdd.dao;

import com.pdd.entity.Shooting;

public interface ShootingMapper {
    int deleteByPrimaryKey(Integer shootingId);

    int insert(Shooting record);

    int insertSelective(Shooting record);

    Shooting selectByPrimaryKey(Integer shootingId);

    int updateByPrimaryKeySelective(Shooting record);

    int updateByPrimaryKey(Shooting record);
}