package com.sangehon.groupware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangehon.groupware.service.BoardService;
import com.sangheon.groupware.vo.BoardVo;
import com.sangheon.groupware.vo.UserVo;
import com.sangheon.security.Auth;
import com.sangheon.security.AuthUser;
@Auth
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("")
	public String index(@RequestParam(value = "p", required = true, defaultValue = "1") Integer page,
						@RequestParam(value = "boardId", required = true, defaultValue = "NOTICE") String boardId, 
						@AuthUser UserVo authUser, 
						Model model) {

		String boardName="";
		String boardAuthority="";
		String isTeam="";
		
		List<BoardVo> boardList = boardService.getBoardList();
		
		for(int i=0;i<boardList.size();i++) {
			
			if(boardList.get(i).getBoardId().equals(boardId)) {
				boardName= boardList.get(i).getBoardName();
				boardAuthority = boardList.get(i).getBoardAuthority();
				isTeam= boardList.get(i).getIsTeam();
				
				break;
			}
		}
		
		model.addAttribute("boardId", boardId);	
		model.addAttribute("boardName", boardName);		
		model.addAttribute("isTeam", isTeam);	
		model.addAttribute("boardAuthority", boardAuthority);	
		model.addAttribute("boardList", boardList);
		
		
		BoardVo boardVo = new BoardVo();
		boardVo.setBoardId(boardId);
		boardVo.setBoardName(boardName);
		boardVo.setIsTeam(isTeam);
		boardVo.setEmployeeNo(authUser.getEmployeeNo());
		boardVo.setTeamId(authUser.getTeamId());
		
		List<BoardVo> list = 
				boardService.getContentList( boardVo );
		
		model.addAttribute( "list", list );
		
		
		return "board/index";
	}

	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(@RequestParam(value = "boardId", required = true, defaultValue = "NOTICE") String boardId, 
			@RequestParam(value = "boardName", required = true, defaultValue = "공지사항") String boardName,
			Model model) {
		
		
		model.addAttribute("boardId", boardId);	
		model.addAttribute("boardName", boardName);	
		
		return "board/write";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String view(@RequestParam(value = "contentId", required = true) String contentId,
			Model model) {
		
		BoardVo boardVo = new BoardVo();
		boardVo.setContentId(contentId);
		BoardVo resVo = boardService.getContent(boardVo);
		
		
		model.addAttribute("contentTitle", resVo.getContentTitle());
		model.addAttribute("content",resVo.getContentContent());
		
		
		return "board/view";
	}

	@RequestMapping( value="/write", method=RequestMethod.POST )
	public String write( @ModelAttribute BoardVo boardVo, @ModelAttribute UserVo userVo) {
		
		boardService.newContent(boardVo);
		
		return "redirect:/board?boardId="+boardVo.getBoardId();		
	}
}
