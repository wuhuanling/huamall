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
    
    public String selectColorByCode(@Param("code") String code ); 
    
    public String selectStandardByCode(@Param("code") String code);
    
    
    public String selectParamByGoodstitle(@Param("title") String title);
    
    public String selectScreenByGoodstitle(@Param("title") String title);
    
    public String selectStorageByGoodstitle(@Param("title") String title );
    
    public String selectTransmissionByGoodstitle(@Param("title") String title ); 
    
    public String selectShootingByGoodstitle(@Param("title") String title);
}