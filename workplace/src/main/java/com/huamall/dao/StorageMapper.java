package com.huamall.dao;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Storage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer storageId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer storageId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
    
    public String selectStorageByGoodstitle(@Param("title") String title );
}