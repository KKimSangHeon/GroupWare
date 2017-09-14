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
	
	@RequestMapping( "/board")
	public String board() {
		return "main/board";
	}
	
	@RequestMapping( "/write")
	public String write() {
		return "main/write";
	}
	
	@RequestMapping( "/join")
	public String join() {
		return "main/join";
	}	
	@RequestMapping( "/test")
	public String test() {
		return "main/test";
	}
	@RequestMapping( "/message")
	public String message() {
		return "main/message";
	}
	@RequestMapping( "/search_employee")
	public String search_employee() {
		return "main/search_employee";
	}
	@RequestMapping( "/mypage")
	public String mypage() {
		return "main/mypage";
	}
}