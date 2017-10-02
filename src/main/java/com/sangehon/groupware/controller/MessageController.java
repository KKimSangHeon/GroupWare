package com.sangehon.groupware.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangehon.groupware.service.MessageService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.BoardVo;
import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.groupware.vo.UserVo;
import com.sangheon.security.Auth;
import com.sangheon.security.AuthUser;


@Auth
@Controller
@RequestMapping( "/message" )
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping( "")
	public String message(@AuthUser UserVo authUser, 
											Model model) {
		MessageVo messageVo= new MessageVo();
		messageVo.setEmployeeNo(authUser.getEmployeeNo());
		List<MessageVo> list = 
				messageService.getMessage( messageVo );
		
		model.addAttribute( "list", list );
		
		
		return "message/index";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String view(@RequestParam(value = "messageId", required = true) String messageId,
			Model model) {
		
		MessageVo messageVo = new MessageVo();
		messageVo.setMessageId(messageId);
		MessageVo resVo = messageService.getDetailMessage(messageVo);
		
		
		
		model.addAttribute("sender", resVo.getSender());
		model.addAttribute("message", resVo.getMessage());
		return "message/view";
	}
	
	
	@RequestMapping( value="/deleteMessage", method=RequestMethod.POST)
	public String deleteMessage(@ModelAttribute MessageVo messageVo) {
		int count = messageService.deleteMessage(messageVo);
		return "message/index";
	}
	
	
	@ResponseBody
	@RequestMapping( value="/sendMessage", method=RequestMethod.POST )
	public JSONResult sendMessage(@ModelAttribute MessageVo messageVo) {
		int count = messageService.sendMessage(messageVo);
		return JSONResult.success(count);
	}
	
	@ResponseBody
	@RequestMapping( value="/answerMessage", method=RequestMethod.POST )
	public JSONResult answerMessage(@ModelAttribute MessageVo messageVo) {
		
		int count = messageService.answerMessage(messageVo);
		
		return JSONResult.success(count);
	}
}
