package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangheon.security.Auth;


@Auth
@Controller
@RequestMapping( "/mypage" )
public class MyPageController {

	
	@RequestMapping( "")
	public String mypage() {
		return "mypage/index";
	}
}
