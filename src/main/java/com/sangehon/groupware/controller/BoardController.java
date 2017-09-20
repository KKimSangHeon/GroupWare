package com.sangehon.groupware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String index(@RequestParam(value = "p", required = true, defaultValue = "1") Integer page,
						@RequestParam(value = "boardId", required = true, defaultValue = "FREE") String boardId, 
						Model model) {

		String boardName="";
		List<BoardVo> boardList = boardService.getBoardList();
		
		for(int i=0;i<boardList.size();i++) {
			if(boardList.get(i).getId().equals(boardId)) {
				boardName= boardList.get(i).getName();
				break;
			}
		}
		
		
		model.addAttribute("boardId", boardId);	
		model.addAttribute("boardName", boardName);		
		model.addAttribute("boardList", boardList);

		return "board/index";
	}

	@RequestMapping("/write")
	public String write(@RequestParam(value = "boardId", required = true, defaultValue = "FREE") String boardId, 
			@RequestParam(value = "boardName", required = true, defaultValue = "자유게시판") String boardName,
			Model model) {
		
		model.addAttribute("boardId", boardId);	
		model.addAttribute("boardName", boardName);	
		
		return "board/write";
	}

}
