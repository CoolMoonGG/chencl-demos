package com.wangmeng.mapper;

import com.wangmeng.beans.SysConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysConfigMapper   {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}