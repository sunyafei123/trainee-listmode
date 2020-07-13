package com.boss.trainee.listmode.service;

import com.boss.trainee.listmode.dao.ApplicationDao;
import com.boss.trainee.listmode.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 18:49
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationDao applicationDao;

    @Override
    public List<Application> getAllApp() {
        return  applicationDao.getAllApp();
    }

    @Override
    public Application getAppById(int appId) {
        return applicationDao.getAppById(appId);
    }

    @Override
    public int deleteAppById(int appId) {
        return applicationDao.deleteAppById(appId);
    }

    @Override
    public int addApp(Application app) {
        return 0;
    }
}
