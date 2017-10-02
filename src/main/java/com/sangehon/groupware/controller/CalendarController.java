package com.sangehon.groupware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sangehon.groupware.service.CalendarService;
import com.sangheon.security.Auth;
@Auth
@Controller
@RequestMapping("/calendar")
public class CalendarController {

	@Autowired
	private CalendarService calendarService;


	@RequestMapping(value="", method=RequestMethod.GET)
	public String write() {
		
		
		return "calendar/index";
	}

}
