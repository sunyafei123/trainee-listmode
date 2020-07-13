package com.boss.trainee.listmode.service;

import com.boss.trainee.listmode.dao.GoodsDao;
import com.boss.trainee.listmode.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/13 8:45
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<Goods> getAllGoods() {
        return goodsDao.getAllGoods();
    }

    @Override
    public Goods getGoodsById(int id) {
        return goodsDao.getGoodsById(id);
    }
}
