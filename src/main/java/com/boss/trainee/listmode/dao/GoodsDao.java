package com.boss.trainee.listmode.dao;

import com.boss.trainee.listmode.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
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
     *
     * @return
     */
    List<Goods> getAllGoods();

    Goods getGoodsById(int id);

    int addGoods(Goods goods);

    int deleteGoods(int id);
}
