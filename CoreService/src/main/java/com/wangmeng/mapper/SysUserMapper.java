package com.wangmeng.mapper;

import com.wangmeng.beans.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper  {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> getAll();
}