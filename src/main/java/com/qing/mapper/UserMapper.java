package com.qing.mapper;

import com.qing.entity.User;

public interface UserMapper {
    //获取用户表前八条
    User GetEightUser(User user);
}