package com.wangmeng.mapper;

import com.wangmeng.beans.Opratelog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OpratelogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Opratelog record);

    int insertSelective(Opratelog record);

    Opratelog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Opratelog record);

    int updateByPrimaryKey(Opratelog record);
}