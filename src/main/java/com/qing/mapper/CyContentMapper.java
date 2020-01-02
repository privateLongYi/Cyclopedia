package com.qing.mapper;

import com.qing.entity.CyClassify;
import com.qing.entity.CyContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyContentMapper {


    //新增
    void saveCyContent(CyContent cyContent);

    //类别删除
    void delCyContentbytype(CyContent cyContent);

    //id删除
    void delCyContentbyid(CyContent cyContent);

    //id修改
    void updCyContentbyid(CyContent cyContent);

    //id查询
    CyContent queryCyContentbyid(CyContent cyContent);

    //类别查询
    List<CyContent>queryCyContentbytype(CyContent cyContent);

    //查询所有
    List<CyContent>queryall();

    //获取内容表前八条
    List<CyContent> GetEightCyContent(CyContent cyContent);

    //分页查询内容表
    List<CyContent> querCyContent(@Param("page") Integer page,
                                   @Param("count") Integer count);

}