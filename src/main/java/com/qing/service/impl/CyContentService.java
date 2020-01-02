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
    public void delCyContentbytypePushcontent(CyContent cyContent) { cyContentMapper.delCyContentbytypePushcontent(cyContent); }

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
    public List<CyContent> queryCyContentbytypePushcontent(CyContent cyContent) {
        return cyContentMapper.queryCyContentbytypePushcontent(cyContent);
    }

    @Override
    public List<CyContent> queryall() {
        return cyContentMapper.queryall();
    }

    @Override
    public List<CyContent> queryallPushcontent() {
        return cyContentMapper.queryallPushcontent();
    }

    @Override
    public List<CyContent> queryallNoPushcontent() {
        return cyContentMapper.queryallNoPushcontent();
    }

    @Override
    public List<CyContent> GetEightCyContent(CyContent cyContent) {
        return cyContentMapper.GetEightCyContent(cyContent);
    }

    @Override
    public List<CyContent> GetEightCyContentPushcontent(CyContent cyContent) {
        return cyContentMapper.GetEightCyContentPushcontent(cyContent);
    }

    @Override
    public List<CyContent> querCyContent(Integer page, Integer count, String keyword) {
        return cyContentMapper.querCyContent(page, count, keyword);
    }

    @Override
    public List<CyContent> querCyClassifyPushcontent(Integer page, Integer count, String keyword) {
        return cyContentMapper.querCyClassifyPushcontent(page, count, keyword);
    }


}
