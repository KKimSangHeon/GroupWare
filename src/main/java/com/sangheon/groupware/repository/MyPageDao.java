package com.sangheon.groupware.repository;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.UserVo;

@Repository
public class MyPageDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int modify( UserVo userVo) {
		return sqlSession.update("mypage.modify", userVo );
		
	}
	
}
