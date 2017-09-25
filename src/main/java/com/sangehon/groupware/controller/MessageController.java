package com.sangehon.groupware.controller;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangehon.groupware.service.MessageService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.security.Auth;


@Auth
@Controller
@RequestMapping( "/message" )
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping( "")
	public String message() {
		return "message/index";
	}
	
	
	@ResponseBody
	@RequestMapping( value="/sendMessage", method=RequestMethod.POST )
	public JSONResult view(@ModelAttribute MessageVo messageVo) {
		
		int count = messageService.sendMessage(messageVo);
		
		return JSONResult.success(count);
	}
}
