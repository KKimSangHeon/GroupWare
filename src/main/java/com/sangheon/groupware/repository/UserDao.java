package com.sangheon.groupware.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangehon.groupware.exception.UserDaoException;
import com.sangheon.groupware.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert( UserVo vo ) {
		int count = sqlSession.insert("user.insert", vo);
		return count;
	}	
	
	public UserVo get( String employeeNo ) {
		return sqlSession.selectOne( "user.getByNo", employeeNo );
	}
	
	
	public UserVo get( String employeeNo, String password ) throws UserDaoException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employeeNo", employeeNo);
		map.put("password", password);
		UserVo vo = sqlSession.selectOne("user.getByemployeeNoAndPassword", map);
		
		return vo;
	}
	
}
