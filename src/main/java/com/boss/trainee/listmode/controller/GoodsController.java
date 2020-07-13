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

    @RequestMapping("/deleteGoods/{id}")
    public String deleteGoods(@PathVariable int id){
        if(goodsService.deleteGoods(id)==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @RequestMapping("/addGoods")
    public String addGoods(){
        Goods goods=new Goods("鼠标","小型",30,"七楼","半个月",4);
        if(goodsService.addGoods(goods)==1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    @RequestMapping("/updateGoods")
    public String updateGoods(){
        Goods goods=new Goods(5,"鼠标","小型",30,"七楼","半个月",2);
//        Goods goods=new Goods(5,"投影仪","大型",30,"七楼","半个月",2);

        if(goodsService.updateGoods(goods)==1){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

}
