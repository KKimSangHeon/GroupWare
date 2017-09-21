package com.sangheon.groupware.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.UserVo;


@Repository
public class SearchEmployeeDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVo> getEmployeeList(UserVo userVo ) {
		return sqlSession.selectList( "searchEmployee.getEmployeeList",userVo );
	}
}
