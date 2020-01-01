package com.qing.service.impl;

import com.qing.entity.AoaSysMenu;
import com.qing.mapper.AoaSysMenuMapper;
import com.qing.service.IAoaSysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AoaSysMenuService implements IAoaSysMenuService {

    @Autowired
    private AoaSysMenuMapper aoaSysMenuMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<AoaSysMenu> querySysMenuByName(Integer page, Integer count, String keyword) {
        return aoaSysMenuMapper.querySysMenuByName(page, count, keyword);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer queryTotalByName(String keyword) {
        return aoaSysMenuMapper.queryTotalByName(keyword);
    }
}
