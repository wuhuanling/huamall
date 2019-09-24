package com.pdd.dao;

import org.apache.ibatis.annotations.Param;

import com.pdd.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    Users selectByUnameAndPwd(@Param("user")String username,@Param("pwd")String password);
}