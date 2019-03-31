package com.mc.contract.request;

import com.mc.contract.BaseRequest;
import lombok.Data;
import lombok.ToString;

import java.lang.annotation.Documented;

/**
 * 测试请求实体
 * 使用lambok插件，@Data注解：代表实体会自动生成getter setter equals tostring hashcode
 * @ToString注解：代表实体包含tostring方法，callSuper代表tostring返回父类的属性
 */
@Data
@ToString(callSuper = true)
public class DemoRequest extends BaseRequest {

    private String name;
    private String param1;
    private int id;
    private String param2;
}
