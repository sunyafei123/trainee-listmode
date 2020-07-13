package com.boss.trainee.listmode.service;

import com.boss.trainee.listmode.entity.Goods;

import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/13 8:45
 */
public interface GoodsService {
    List<Goods> getAllGoods();

    Goods getGoodsById(int id);
}
