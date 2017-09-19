package com.sangheon.groupware.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.BoardVo;


@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> getBoardList( ) {
		
		return sqlSession.selectList( "board.getBoardList" );
	}
	
}
