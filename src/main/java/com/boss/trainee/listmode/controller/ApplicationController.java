package com.boss.trainee.listmode.controller;


import com.boss.trainee.listmode.entity.Application;
import com.boss.trainee.listmode.entity.Goods;
import com.boss.trainee.listmode.service.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Author syf
 * @Date 2020/7/12 0:54
 */
@RestController
public class ApplicationController {

    @Autowired
    private ApplicationServiceImpl applicationService;

    @RequestMapping("/getAppById/{appId}")
    public Application getAppById(@PathVariable int appId){
        return applicationService.getAppById(appId);
    }
    @RequestMapping("/getAllApp")
    public Map<Long,Application> getAllApp( ){
        Map<Long,Application> map=new HashMap<>();
        List<Application> list=applicationService.getAllApp();
        for (Application application : list) {
            Long appId=application.getAppId();
            map.put(appId,application);
        }
        return map;
    }

    @RequestMapping("/deleteApp/{appId}")
    public String deleteGoods(@PathVariable int appId){
        if(applicationService.deleteAppById(appId)==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @RequestMapping("/addApp")

    public String addGoods(){
        List<Goods> goodsList=new ArrayList<>();

        Application apps=new Application("市场部",new Date(),"赵八",goodsList);

        if(applicationService.addApp(apps)==1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
}
