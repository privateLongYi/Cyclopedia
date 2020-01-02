package com.qing.service;

import com.qing.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUser {

    //获取用户表前八条
   List<User>  GetEightUser(User user);

    //登陆
    int login(User user);

    //分页查询用户表
    List<User> queryUserPaging(@Param("page") Integer page, @Param("count") Integer count, @Param("keyword") String keyword);
}
