package com.huamall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huamall.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    List<Goods> selectAllGoods();
    
    public List<Goods> selectGoodsByTypeInfo(@Param("info") String info);
    
    public Goods selectGoodsByTitle(@Param("info") String title );
    
    

}