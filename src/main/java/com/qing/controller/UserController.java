package com.qing.controller;

import com.qing.entity.Menu;
import com.qing.service.impl.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private MenuService menuService;

    //登录
    @RequestMapping("login")
    private String login(){
        return "index";
    }

    //获取菜单
    @RequestMapping("getMenu")
    @ResponseBody
    public List<Map<String, Object>> getMenu(){
        List<Menu> list = menuService.getMenu();
        return getTree(list, 0);
    }

    //根据父级ID获取所有子级
    public List<Map<String, Object>> getTree(List<Menu> list, Integer pid){
        List<Map<String,Object>> list2 = new ArrayList<Map<String, Object>>();
        for (Menu menu : list) {
            if (menu.getMenuPid() == pid) {
                Map<String,Object> map = new HashMap<String, Object>();
                map.put("id", menu.getMenuId());
                map.put("name", menu.getMenuName());
                map.put("pid", menu.getMenuPid());
                if (menu.getChildCount() > 0) {
                    map.put("subset", getTree(list, menu.getMenuId()));
                }else {
                    map.put("url", menu.getMenuUrl());
                }
                list2.add(map);
            }
        }
        return list2;
    }

}
