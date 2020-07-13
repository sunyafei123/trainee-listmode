package com.boss.trainee.listmode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author syf
 * @Date 2020/7/11 23:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private long appId;
    private String department;
    private Date date;
    private String applicant;
    private List<Goods> goods;

    public Application(String department, Date date, String applicant, List<Goods> goods) {
        this.department = department;
        this.date = date;
        this.applicant = applicant;
        this.goods = goods;
    }
}
