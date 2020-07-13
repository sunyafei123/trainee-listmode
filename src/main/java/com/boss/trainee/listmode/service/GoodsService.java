package com.boss.trainee.listmode.service;
import com.boss.trainee.listmode.entity.Goods;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/13 8:45
 */
public interface GoodsService {
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
    Goods getGoodsById(int id);

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
    int deleteGoods(int id);
}
