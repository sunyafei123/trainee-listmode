package com.boss.trainee.listmode.dao;

import com.boss.trainee.listmode.entity.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.HashMap;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 0:40
 */
@Mapper
@Repository
public interface ApplicationDao {
    /**
     * 获取全部申请
     * @return 所有申请
     */
    List<Application> getAllApp();

    /**
     * 通过appId查询单个申请
     * @param appId id
     * @return 单个申请
     */

    Application getAppById(@Param("appId")int appId);

    /**
     *
     * @param appId
     * @return
     */
    int deleteAppById(@Param("appId")int appId);

    /**
     *
     * @param app
     * @return
     */
    int addApp(Application app);
}
