package com.sangheon.groupware.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangheon.groupware.vo.BoardVo;
import com.sangheon.groupware.vo.UserVo;


@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> getBoardList( ) {
		
		return sqlSession.selectList( "board.getBoardList" );
	}
	
	public int newContent( UserVo userVo, BoardVo boardVo ) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "employeeNo", userVo.getEmployeeNo() );
		map.put( "contentTitle", boardVo.getContentTitle() );
		map.put( "contentContent", boardVo.getContentContent() );
		map.put( "teamId", userVo.getTeamId() );
		map.put( "boardId", boardVo.getBoardId() );
		map.put( "contentId", boardVo.getContentTitle()+userVo.getEmployeeNo());
		
		
		
		int count = sqlSession.insert("board.newContent", map);

		return count;
	}	
}
