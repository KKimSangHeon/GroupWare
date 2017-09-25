package com.sangheon.groupware.repository;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.groupware.vo.UserVo;


@Repository
public class MessageDao {
	@Autowired
	private SqlSession sqlSession;
	
	public int sendMessage(MessageVo messageVo ) {
		int count = sqlSession.insert("message.sendMessage", messageVo);
		System.out.println(messageVo.getMessage()+messageVo.getSenderemployeeNo()+messageVo.getReceiverEmail());
		return count;
	}
	
	public List<MessageVo> getMessage(MessageVo messageVo) {
		return sqlSession.selectList("message.getMessage", messageVo);
	}
}
