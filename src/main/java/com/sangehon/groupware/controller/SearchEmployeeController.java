package com.sangehon.groupware.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/searchemployee" )
public class SearchEmployeeController {
	@RequestMapping( "")
	public String mypage() {
		return "searchemployee/index";
	}
}
