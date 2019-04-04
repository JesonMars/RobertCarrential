package com.mc.contract.bo;

import lombok.Data;

import java.util.Date;

/**
 * 业务数据模型,测试model
 */
@Data
public class DemoModel {
    /**
     * id
     */
    private long id;
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
