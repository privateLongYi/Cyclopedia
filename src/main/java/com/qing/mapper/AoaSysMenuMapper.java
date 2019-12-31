package com.qing.mapper;

import com.qing.entity.AoaSysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaSysMenuMapper {

    //根据条件分页查询权限
    List<AoaSysMenu> querySysMenuByName(@Param("page") Integer page,
                                        @Param("count") Integer count,
                                        @Param("keyword") String keyword);

    //根据条件查询总页数
    Integer queryTotalByName(String keyword);

}