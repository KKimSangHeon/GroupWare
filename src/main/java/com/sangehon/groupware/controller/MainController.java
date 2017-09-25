package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(  "/" )
	public String login() {
		return "user/login";
	}
	
	@RequestMapping( "/main")
	public String main() {
		return "main/main";
	}
	

	@RequestMapping( "/test")
	public String test() {
		return "main/test";
	}
	
	

}