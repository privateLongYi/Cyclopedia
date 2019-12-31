package com.qing.service.impl;

import com.qing.entity.CyContent;
import com.qing.mapper.CyContentMapper;
import com.qing.service.ICyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CyContentService implements ICyContentService {

    @Autowired
    private CyContentMapper cyContentMapper;

    @Override
    public void saveCyContent(CyContent cyContent) {
        cyContentMapper.saveCyContent(cyContent);
    }

    @Override
    public void delCyContentbytype(CyContent cyContent) {
        cyContentMapper.delCyContentbytype(cyContent);
    }

    @Override
    public void delCyContentbyid(CyContent cyContent) {
        cyContentMapper.delCyContentbyid(cyContent);
    }

    @Override
    public void updCyContentbyid(CyContent cyContent) {
        cyContentMapper.updCyContentbyid(cyContent);
    }

    @Override
    public CyContent queryCyContentbyid(CyContent cyContent) {
        return cyContentMapper.queryCyContentbyid(cyContent);
    }

    @Override
    public List<CyContent> queryCyContentbytype(CyContent cyContent) {
        return cyContentMapper.queryCyContentbytype(cyContent);
    }

    @Override
    public List<CyContent> queryall() {
        return cyContentMapper.queryall();
    }


}
