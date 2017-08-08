package com.wangmeng.mapper;

import com.wangmeng.beans.SysAtion;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysAtionMapper  {
    int deleteByPrimaryKey(Long id);

    int insert(SysAtion record);

    int insertSelective(SysAtion record);

    SysAtion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysAtion record);

    int updateByPrimaryKey(SysAtion record);
}