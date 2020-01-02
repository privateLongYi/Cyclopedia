package com.qing.service;

import com.qing.entity.CyClassify;
import com.qing.entity.CyContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICyContentService {
    //新增
    void saveCyContent(CyContent cyContent);

    //类别删除
    void delCyContentbytype(CyContent cyContent);

    //类别删除(推送)
    void delCyContentbytypePushcontent(CyContent cyContent);

    //类别查询
    List<CyContent> queryCyContentbytype(CyContent cyContent);

    //类别查询(推送)
    List<CyContent>queryCyContentbytypePushcontent(CyContent cyContent);

    //id删除
    void delCyContentbyid(CyContent cyContent);

    //id修改
    void updCyContentbyid(CyContent cyContent);

    //id查询
    CyContent queryCyContentbyid(CyContent cyContent);

    //查询所有
    List<CyContent>queryall();

    //查询所有(推送)
    List<CyContent>queryallPushcontent();

    //查询所有(不推送)
    List<CyContent>queryallNoPushcontent();

    //获取内容表前八条
    List<CyContent> GetEightCyContent(CyContent cyContent);

    //获取内容表前八条(推送)
    List<CyContent> GetEightCyContentPushcontent(CyContent cyContent);

    //分页查询内容表
    List<CyContent> querCyContent(@Param("page") Integer page, @Param("count") Integer count,@Param("keyword") String keyword);

    //分页查询内容表(推送)
    List<CyContent> querCyClassifyPushcontent(@Param("page") Integer page, @Param("count") Integer count, @Param("keyword") String keyword);

}
