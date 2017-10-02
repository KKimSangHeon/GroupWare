package com.sangheon.groupware.repository;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.BoardVo;


@Repository
public class CalendarDao {
	@Autowired
	private SqlSession sqlSession;
	
	
}
