package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.MessageDao;
import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.groupware.vo.UserVo;

@Service
public class MessageService {

	@Autowired
	private MessageDao messageDao;
	
	
	public int sendMessage(MessageVo messageVo) {
		int result = messageDao.sendMessage(messageVo);
		
		return result;
	}
	
	public int answerMessage(MessageVo messageVo) {
		int result = messageDao.answerMessage(messageVo);
		
		return result;
	}
	
	public int deleteMessage(MessageVo messageVo) {
		int result = messageDao.deleteMessage(messageVo);
		return result;
	}
	
	
	public List<MessageVo> getMessage(MessageVo messageVo) {
		List<MessageVo> list = messageDao.getMessage(messageVo);
		return list;
	}
}
