package com.wangmeng.mapper;

import com.wangmeng.beans.SysPower;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysPowerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPower record);

    int insertSelective(SysPower record);

    SysPower selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPower record);

    int updateByPrimaryKey(SysPower record);
}