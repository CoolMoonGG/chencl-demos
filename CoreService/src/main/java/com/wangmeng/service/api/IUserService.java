package com.wangmeng.service.api;

import com.wangmeng.beans.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

	SysUser getUserById(Long id);

	List<SysUser> getAll();

}
