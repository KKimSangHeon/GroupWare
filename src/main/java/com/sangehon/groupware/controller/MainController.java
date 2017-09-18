package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping( { "/", "/login" })
	public String login() {
		return "main/login";
	}
	
	@RequestMapping( "/main")
	public String main() {
		return "main/main";
	}
	
	
	
	@RequestMapping( "/join")
	public String join() {
		return "main/join";
	}	
	
	
	


	@RequestMapping( "/test")
	public String test() {
		return "main/test";
	}
	
	

}