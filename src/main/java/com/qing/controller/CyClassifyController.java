package com.qing.controller;

import com.qing.entity.CyClassify;
import com.qing.service.impl.CyClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cc")
public class CyClassifyController {

    @Autowired
    private CyClassifyService cyClassifyService;

    //查询所有
    @RequestMapping("queryAllCyClassify")
    public String queryAllCyClassify(ModelMap map){
        List<CyClassify> CyClassifyes = cyClassifyService.queryAllCyClassify();
        map.addAttribute("CyClassifyes", CyClassifyes);
        return "list";
    }

    //新增
    @RequestMapping("saveCyClassify")
    public String saveCyClassify(CyClassify cyClassify){
        cyClassifyService.saveCyClassify(cyClassify);
        return "redirect:queryAllCyClassify";
    }

    //删除
    @RequestMapping("delCyClassifyByCcid")
    public String delCyClassifyByCcid(Integer ccid){
        cyClassifyService.delCyClassifyByCcid(ccid);
        return "redirect:queryAllCyClassify";
    }

    //根据id查询
    @RequestMapping("queryCyClassifyByCcid")
    public String queryCyClassifyByCcid(Integer ccid, ModelMap map){
        CyClassify CyClassify = cyClassifyService.queryCyClassifyByCcid(ccid);
        map.addAttribute("CyClassify", CyClassify);
        return "edit";
    }

    //修改
    @RequestMapping("editCyClassifyByCcid")
    public String editCyClassifyByCcid(CyClassify cyClassify){
        cyClassifyService.editCyClassifyByCcid(cyClassify);
        return "redirect:queryAllCyClassify";
    }

    //获取前八条
    @RequestMapping("GetEightCyClassify")
    public String GetEightCyClassify(CyClassify cyClassify,ModelMap map){
        List<CyClassify> cyClassifyList=cyClassifyService.GetEightCyClassify(cyClassify);
        map.addAttribute("CyClassify",cyClassifyList);
        return "list";
    }

    //分页查询
    @RequestMapping("querCyClassify")
    public String querCyClassify(Integer page,Integer count,ModelMap map){
        List<CyClassify> cyClassifyList=cyClassifyService.querCyClassify((page-1)*count,count);
        map.addAttribute("cyClassifyList",cyClassifyList);
        return "list";
    }

}
