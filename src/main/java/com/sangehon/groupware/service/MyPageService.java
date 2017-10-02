package com.sangehon.groupware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.MyPageDao;
import com.sangheon.groupware.vo.UserVo;

@Service
public class MyPageService {

	@Autowired
	private MyPageDao myPageDao;
	
	public int modify(UserVo userVo) {
		int result = myPageDao.modify(userVo);
		
		return result;
	}
	
}
