package com.boss.trainee.listmode.service;

import com.boss.trainee.listmode.entity.Application;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 18:49
 */
public interface ApplicationService {
    /**
     * 获取全部申请
     * @return 所有申请
     */
    List<Application> getAllApp();

    /**
     * 通过appId查询单个申请
     * @param appId 申请表id
     * @return 单个申请
     */

    Application getAppById(int appId);

    /**
     *通过appId删除一个申请表
     * @param appId 申请表id
     * @return 1为成功 0为失败
     */
    int deleteAppById(int appId);

    /**
     *添加一个申请表
     * @param app 一个申请表
     * @return 1为成功 0为失败
     */
    int addApp(Application app);
}
