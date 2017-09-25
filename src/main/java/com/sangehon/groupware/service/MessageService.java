package com.sangehon.groupware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.MessageDao;
import com.sangheon.groupware.vo.MessageVo;

@Service
public class MessageService {

	@Autowired
	private MessageDao messageDao;
	
	
	public int sendMessage(MessageVo messageVo) {
		int result = messageDao.sendMessage(messageVo);
		
		return result;
	}
	
}
