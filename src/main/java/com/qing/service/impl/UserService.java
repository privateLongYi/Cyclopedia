package com.qing.service.impl;

import com.qing.entity.User;
import com.qing.mapper.UserMapper;
import com.qing.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  implements IUser{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> GetEightUser(User user) {
        return userMapper.GetEightUser(user);
    }

    @Override
    public int login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> queryUserPaging(Integer page, Integer count, String keyword) {
        return userMapper.queryUserPaging(page, count, keyword);
    }
}
