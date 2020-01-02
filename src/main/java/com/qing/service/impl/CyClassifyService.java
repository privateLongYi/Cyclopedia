package com.qing.service.impl;

import com.qing.entity.CyClassify;
import com.qing.mapper.CyClassifyMapper;
import com.qing.service.ICyClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CyClassifyService implements ICyClassifyService {

    @Autowired
    private CyClassifyMapper cyClassifyMapper;

    @Override
    public void saveCyClassify(CyClassify cyClassify) {
        cyClassifyMapper.saveCyClassify(cyClassify);
    }

    @Override
    public void delCyClassifyByCcid(Integer ccid) {
        cyClassifyMapper.delCyClassifyByCcid(ccid);
    }

    @Override
    public void editCyClassifyByCcid(CyClassify cyClassify) {
        cyClassifyMapper.editCyClassifyByCcid(cyClassify);
    }

    @Override
    public CyClassify queryCyClassifyByCcid(Integer ccid) {
        return cyClassifyMapper.queryCyClassifyByCcid(ccid);
    }

    @Override
    public List<CyClassify> queryAllCyClassify() {
        return cyClassifyMapper.queryAllCyClassify();
    }

    @Override
    public List<CyClassify> GetEightCyClassify(CyClassify cyClassify) {
        return cyClassifyMapper.GetEightCyClassify(cyClassify);
    }

    @Override
    public List<CyClassify> querCyClassify(Integer page, Integer count) {
        return cyClassifyMapper.querCyClassify(page,count);
    }
}
