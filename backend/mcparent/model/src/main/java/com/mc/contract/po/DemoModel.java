package com.mc.contract.po;

import lombok.Data;

import java.util.Date;

/**
 * mapper数据模型,测试model
 */
@Data
public class DemoModel {
    /**
     * id
     */
    private int id;
    /**
     * name
     */
    private String name;
    private int store;
    private Date utime;
    private Date ctime;
    private String sex;
    private int isEnable;
}
