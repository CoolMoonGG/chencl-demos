package com.wangmeng.service.impl;

import com.wangmeng.beans.SysUser;
import com.wangmeng.mapper.SysUserMapper;
import com.wangmeng.service.api.IUserService;

import javax.annotation.Resource;
import java.util.List;


public class UserServiceImpl implements IUserService {

	@Resource
	private SysUserMapper userMapper;


	@Override
	public SysUser getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

    @Override
	public List<SysUser> getAll() {
		return userMapper.getAll();
	}


}
