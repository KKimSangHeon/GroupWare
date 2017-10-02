package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.BoardDao;
import com.sangheon.groupware.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;

	
	public BoardVo getContent(BoardVo boardVo) {
		return boardDao.getContent(boardVo);
		
	}
	
	public List<BoardVo> getBoardList() {
		List<BoardVo> list = boardDao.getBoardList();
		return list;
	}
	
	public List<BoardVo> getContentList(BoardVo boardVo) {
		List<BoardVo> list =null;
		if(boardVo.getIsTeam().equals("N")) {
			list = boardDao.getContentList(boardVo);
		}
		else {
			list = boardDao.getContentListByTeam(boardVo);
			System.out.println(boardVo.getTeamId());
		}
		
		return list;
	}
	
	public boolean newContent(BoardVo boardVo) {
		
		
		return boardDao.newContent(boardVo ) == 1;
	}
}
