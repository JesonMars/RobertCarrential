package com.mc.mapper.demo.IReader;

import com.mc.contract.po.DemoModel;
import com.mc.mapper.IBaseReader;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDemoReader extends IBaseReader<DemoModel> {
}
