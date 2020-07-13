package com.boss.trainee.listmode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;
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
}
