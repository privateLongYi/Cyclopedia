package com.qing.service.impl;

import com.qing.entity.Menu;
import com.qing.mapper.MenuMapper;
import com.qing.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuService implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenu() {
        return menuMapper.getMenu();
    }

}
