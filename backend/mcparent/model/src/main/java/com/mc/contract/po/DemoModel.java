package com.mc.contract.po;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;
import java.util.Date;

/**
 * mapper数据模型,测试model
 */
@Data
@Table(name = "product")
public class DemoModel {
    /**
     * id
     */
    @Id
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
