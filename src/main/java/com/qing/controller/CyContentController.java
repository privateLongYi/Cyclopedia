package com.qing.controller;


import com.qing.entity.CyClassify;
import com.qing.entity.CyContent;
import com.qing.service.impl.CyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("cc2")
public class CyContentController {

        @Autowired
        private    CyContentService cyContentService;

        //查询所有
        @RequestMapping("queryall")
        public String queryall(ModelMap map){
            List<CyContent> cyContent = cyContentService.queryall();
            map.addAttribute("CyClassifyes", cyContent);
            return "list";
        }

        //查询所有(推送)
        @RequestMapping("queryallPushcontent")
        public String queryallPushcontent(ModelMap map){
            List<CyContent> cyContent = cyContentService.queryallPushcontent();
            map.addAttribute("CyClassifyes", cyContent);
            return "list";
        }

        //查询所有(不推送)
        @RequestMapping("queryallNoPushcontent")
        public String queryallNoPushcontent(ModelMap map){
            List<CyContent> cyContent = cyContentService.queryallNoPushcontent();
            map.addAttribute("CyClassifyes", cyContent);
            return "list";
        }

        //新增
        @RequestMapping("saveCyContent")
        public String saveCyContent(CyContent cyContent){
            cyContentService.saveCyContent(cyContent);
            return "redirect:queryAll";
        }

        //类别删除
        @RequestMapping("delCyContentbytype")
        public String delCyContentbytype(CyContent cyContent){
            cyContentService.delCyContentbytype(cyContent);
            return "redirect:queryAll";
        }

        //类别删除(推送)
        @RequestMapping("delCyContentbytypePushcontent")
        public String delCyContentbytypePushcontent(CyContent cyContent){
            cyContentService.delCyContentbytypePushcontent(cyContent);
            return "redirect:queryAll";
        }

        //id删除
        @RequestMapping("delCyContentbyid")
        public String delCyContentbyid(CyContent cyContent){
            cyContentService.delCyContentbyid(cyContent);
            return "redirect:queryAll";
        }
        //id修改
        @RequestMapping("updCyContentbyid")
        public String updCyContentbyid(CyContent cyContent){
            cyContentService.updCyContentbyid(cyContent);
            return "redirect:queryAll";
        }
        //类别查询
        @RequestMapping("queryCyContentbytype")
        public String queryCyContentbytype(CyContent cyContent){
            cyContentService.queryCyContentbytype(cyContent);
            return "redirect:queryAll";
        }

        //类别查询
        @RequestMapping("queryCyContentbytypePushcontent")
        public String queryCyContentbytypePushcontent(CyContent cyContent){
            cyContentService.queryCyContentbytypePushcontent(cyContent);
            return "redirect:queryAll";
        }

        //id查询
        @RequestMapping("queryCyContentbyid")
        public String queryCyContentbyid(CyContent cyContent){
            cyContentService.queryCyContentbyid(cyContent);
            return "redirect:queryAll";
        }

        //获取前八条(推送)
        @RequestMapping("GetEightCyContentPushcontent")
        @ResponseBody
        public List<CyContent> GetEightCyContentPushcontent(CyContent cyContent){
            return cyContentService.GetEightCyContentPushcontent(cyContent);
        }

        //分页查询
        @RequestMapping("querCyContent")
        @ResponseBody
        public List<CyContent> querCyContent(Integer page,Integer count,String keyword){
            return cyContentService.querCyContent((page-1)*count,count,keyword);
        }

        //分页查询(推送)
        @RequestMapping("queryPushContent")
        @ResponseBody
        public List<CyContent> querCyClassifyPushcontent(Integer page,Integer count,String keyword){
            return cyContentService.querCyClassifyPushcontent((page-1)*count,count,keyword);
        }
}
