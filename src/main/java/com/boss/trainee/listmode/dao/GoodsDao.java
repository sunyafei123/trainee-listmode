package com.boss.trainee.listmode.dao;

import com.boss.trainee.listmode.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/12 0:18
 */
@Mapper
@Repository
public interface GoodsDao {
    /**
     *获取全部物品
     * @return 物品列表
     */
    List<Goods> getAllGoods();

    /**
     *通过id查找物品
     * @param id 物品id
     * @return 根据id查物品
     */
    Goods getGoodsById(@Param("id") int id);

    /**
     *添加物品
     * @param goods 物品
     * @return 1为成功 0为失败
     */
    int addGoods(Goods goods);

    /**
     *通过id删除物品
     * @param id 物品id
     * @return 1为成功 0为失败
     */
    int deleteGoods(@Param("id") int id);

    /**
     * 更新物品
     * @param goods 物品
     * @return 1为成功 0为失败
     */

    int updateGoods(Goods goods);
}
