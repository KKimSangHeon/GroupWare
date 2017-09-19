package com.sangehon.groupware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.UserDao;
import com.sangheon.groupware.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean join( UserVo userVo ) {
		return userDao.insert( userVo ) == 1;
	}
	
	
}
