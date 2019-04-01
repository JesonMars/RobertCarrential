package com.mc.mapper;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.RowBoundsMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;
import tk.mybatis.mapper.common.example.SelectCountByExampleMapper;
import tk.mybatis.mapper.common.example.SelectOneByExampleMapper;

@Mapper
public interface IBaseReader<T> extends SelectByExampleMapper<T>, SelectOneByExampleMapper<T>, SelectCountByExampleMapper<T>, RowBoundsMapper<T>, BaseSelectMapper<T>, Marker {
}
