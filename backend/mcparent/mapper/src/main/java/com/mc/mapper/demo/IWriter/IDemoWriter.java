package com.mc.mapper.demo.IWriter;

import com.mc.contract.po.DemoModel;
import com.mc.mapper.IBaseWriter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDemoWriter extends IBaseWriter<DemoModel> {
}
