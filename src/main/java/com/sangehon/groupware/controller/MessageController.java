package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangheon.security.Auth;


@Auth
@Controller
@RequestMapping( "/message" )
public class MessageController {

	
	@RequestMapping( "")
	public String message() {
		return "message/index";
	}
}
