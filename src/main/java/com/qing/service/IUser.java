package com.qing.service;

import com.qing.entity.User;

import java.util.List;

public interface IUser {

    //获取用户表前八条
   List<User>  GetEightUser(User user);

    //登陆
    int login(User user);
}
