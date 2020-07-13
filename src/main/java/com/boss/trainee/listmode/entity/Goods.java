package com.boss.trainee.listmode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author syf
 * @Date 2020/7/11 23:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private long id;

    private String name;

    private String type;

    private int number;

    private String place;

    private String time;

    private long appId;

    public Goods(String name, String type, int number, String place, String time, long appId) {
        this.name = name;
        this.type = type;
        this.number = number;
        this.place = place;
        this.time = time;
        this.appId = appId;
    }
}
