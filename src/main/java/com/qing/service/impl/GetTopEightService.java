package com.qing.service.impl;

import com.qing.entity.CyClassify;
import com.qing.entity.CyContent;
import com.qing.entity.User;
import com.qing.mapper.CyClassifyMapper;
import com.qing.mapper.CyContentMapper;
import com.qing.mapper.MenuMapper;
import com.qing.mapper.UserMapper;
import com.qing.service.GetTopEight;
import org.springframework.beans.factory.annotation.Autowired;

public class GetTopEightService implements GetTopEight {

    @Autowired
    UserMapper userMapper;
    @Autowired
    CyClassifyMapper cyClassifyMapper;
    @Autowired
    CyContentMapper cyContentMapper;

    @Override
    public CyClassify GetEightCyClassify(CyClassify cyClassify) {
        return cyClassifyMapper.GetEightCyClassify(cyClassify);
    }

    @Override
    public CyContent GetEightCyContent(CyContent cyContent) {
        return cyContentMapper.GetEightCyContent(cyContent);
    }

    @Override
    public User GetEightUser(User user) {
        return userMapper.GetEightUser(user);
    }
}
