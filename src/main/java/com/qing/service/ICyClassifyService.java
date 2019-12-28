package com.qing.service;

import com.qing.entity.CyClassify;

import java.util.List;

public interface ICyClassifyService {

    //新增
    void saveCyClassify(CyClassify cyClassify);

    //根据id删除
    void delCyClassifyByCcid(Integer ccid);

    //修改
    void editCyClassifyByCcid(CyClassify cyClassify);

    //根据id查询
    CyClassify queryCyClassifyByCcid(Integer ccid);

    //查询全部
    List<CyClassify> queryAllCyClassify();

}
