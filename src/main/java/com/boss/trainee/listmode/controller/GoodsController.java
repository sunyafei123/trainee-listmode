package com.boss.trainee.listmode.controller;

import com.boss.trainee.listmode.entity.Goods;
import com.boss.trainee.listmode.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/13 8:34
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;

    @RequestMapping("/getAllGoods")
    public List<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }

    @RequestMapping("/getGoodsById/{id}")
    public Goods getGoodsById(@PathVariable int id){
        return goodsService.getGoodsById(id);
    }
}
