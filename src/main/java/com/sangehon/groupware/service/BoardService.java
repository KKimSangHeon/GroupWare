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

	public List<BoardVo> getBoardList() {
		List<BoardVo> list = boardDao.getBoardList();
		return list;
	}
}
