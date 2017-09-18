package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/mypage" )
public class MyPageController {

	
	@RequestMapping( "")
	public String mypage() {
		return "mypage/index";
	}
}
