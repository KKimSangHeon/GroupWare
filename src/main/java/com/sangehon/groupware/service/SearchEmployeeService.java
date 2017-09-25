package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.MessageDao;
import com.sangheon.groupware.repository.SearchEmployeeDao;
import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.groupware.vo.UserVo;

@Service
public class SearchEmployeeService {

	@Autowired
	private SearchEmployeeDao searchEmployeeDao;
	
	@Autowired
	private MessageDao messageDao;
	
	public List<UserVo> getEmployeeList(UserVo userVo) {
		List<UserVo> list = searchEmployeeDao.getEmployeeList(userVo);
		
		return list;
	}
	
	public List<MessageVo> getMessage(MessageVo messageVo) {
		List<MessageVo> list = messageDao.getMessage(messageVo);
		
		return list;
	}
	
}
