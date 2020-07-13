package com.boss.trainee.listmode.controller;

import com.boss.trainee.listmode.dao.ApplicationDao;
import com.boss.trainee.listmode.entity.Application;
import com.boss.trainee.listmode.service.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author syf
 * @Date 2020/7/12 0:54
 */
@RestController
public class ApplicationController {

    @Autowired
    private ApplicationServiceImpl app;

    @RequestMapping("/getAppById/{appId}")
    public Application getAppById(@PathVariable int appId){
        return app.getAppById(appId);
    }
    @RequestMapping("/getAllApp")
    public Map<Long,Application> getAllApp( ){
        Map<Long,Application> map=new HashMap<>();
        List<Application> list=app.getAllApp();
        for (Application application : list) {
            Long appId=application.getAppId();
            map.put(appId,application);
        }
        return map;
    }
}
