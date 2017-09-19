package com.sangehon.groupware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangehon.groupware.service.BoardService;
import com.sangheon.groupware.vo.BoardVo;
import com.sangheon.security.Auth;

@Auth
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("")
	public String index(Model model) {

		List<BoardVo> boardList =  boardService.getBoardList();
		
		model.addAttribute( "boardList", boardList );
		
		return "board/index";
	}

	@RequestMapping("/write")
	public String write() {
		return "board/write";
	}

}
