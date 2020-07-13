package com.boss.trainee.listmode.service;

import com.boss.trainee.listmode.entity.Application;

import java.util.HashMap;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 18:49
 */
public interface ApplicationService {
    List<Application> getAllApp();
    Application getAppById(int appId);
    int deleteAppById(int appId);
    int addApp(Application app);
}
