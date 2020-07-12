package com.boss.trainee.listmode.controller;

import com.boss.trainee.listmode.dao.ApplicationDao;
import com.boss.trainee.listmode.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 0:54
 */
@RestController
public class ApplicationController {

    @Autowired
    private ApplicationDao applicationDao;

    @RequestMapping("/getById/{appId}")
    public Application getById(@PathVariable int appId){
        Application app = applicationDao.getById(appId);
        return app;
    }
    @RequestMapping("/getAll")
    public List<Application> getAll( ){
        List<Application> list = applicationDao.getAll();
        return list;
    }
}
