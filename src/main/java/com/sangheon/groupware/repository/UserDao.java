package com.sangheon.groupware.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert( UserVo vo ) {
		int count = sqlSession.insert("user.insert", vo);
		return count;
	}	
	
	
}
