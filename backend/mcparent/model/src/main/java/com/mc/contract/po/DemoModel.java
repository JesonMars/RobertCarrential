package com.mc.contract.po;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import tk.mybatis.mapper.annotation.ColumnType;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
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
    @Column(name = "id")
    @KeySql(useGeneratedKeys = true)
    private long id;
    /**
     * name
     */
    private String name;
    @Column(name = "store")
    private int store;
    private Date utime;
    private Date ctime;
    private String sex;
    @Column(name = "is_enable")
    private int isEnable;
}
