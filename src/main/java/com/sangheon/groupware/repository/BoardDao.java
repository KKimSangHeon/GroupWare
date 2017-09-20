package com.sangheon.groupware.repository;

import java.util.ArrayList;
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
	
	public int newContent( BoardVo boardVo ) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "employeeNo", boardVo.getEmployeeNo() );
		map.put( "contentTitle", boardVo.getContentTitle() );
		map.put( "contentContent", boardVo.getContentContent() );
		map.put( "teamId", boardVo.getTeamId() );
		map.put( "boardId", boardVo.getBoardId() );
		map.put( "contentId", boardVo.getContentTitle()+boardVo.getEmployeeNo());
		
		
		
		int count = sqlSession.insert("board.newContent", map);

		return count;
	}	
	public List<BoardVo> getContentList(BoardVo boardVo ) {

		return sqlSession.selectList( "board.getContentList",boardVo );
	}
	public List<BoardVo> getContentListByTeam(BoardVo boardVo ) {

		return sqlSession.selectList( "board.getContentListByTeam",boardVo );
	}
}
