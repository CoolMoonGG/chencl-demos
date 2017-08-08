package com.wangmeng.mapper;

import com.wangmeng.beans.RolePower;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RolePowerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePower record);

    int insertSelective(RolePower record);

    RolePower selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePower record);

    int updateByPrimaryKey(RolePower record);
}