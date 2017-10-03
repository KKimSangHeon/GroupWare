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
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	
	public BoardVo getContent(BoardVo boardVo) {
		return sqlSession.selectOne("board.getContent" ,boardVo);
		
	}
	
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
		Calendar calendar = Calendar.getInstance();
		map.put( "contentId", boardVo.getEmployeeNo()+calendar.get( Calendar.YEAR )+calendar.get( Calendar.MONTH )+
				calendar.get( Calendar.DATE )+calendar.get( Calendar.HOUR )+calendar.get( Calendar.MINUTE )+
				calendar.get( Calendar.SECOND )+calendar.get( Calendar.MILLISECOND ));
		
		int count = sqlSession.insert("board.newContent", map);

		return count;
	}	
	public List<BoardVo> getContentList(BoardVo boardVo ) {

		return sqlSession.selectList( "board.getContentList",boardVo );
	}
	public List<BoardVo> getContentListByTeam(BoardVo boardVo ) {

		return sqlSession.selectList( "board.getContentListByTeam",boardVo );
	}

	public int deleteContent( BoardVo boardVo ) {
		
		return sqlSession.delete("board.deleteContent",boardVo);
	}
}
