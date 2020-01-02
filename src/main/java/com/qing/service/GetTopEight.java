package com.qing.service;

import com.qing.entity.CyClassify;
import com.qing.entity.CyContent;
import com.qing.entity.User;

public interface GetTopEight {
        //获取分类表前八条
        CyClassify GetEightCyClassify(CyClassify cyClassify);

        //获取内容表前八条
        CyContent GetEightCyContent(CyContent cyContent);

        //获取用户表前八条
        User GetEightUser(User user);
}
