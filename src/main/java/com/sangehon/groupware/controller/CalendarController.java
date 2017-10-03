package com.sangehon.groupware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangehon.groupware.service.CalendarService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.CalendarVo;
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
	
	@ResponseBody
	@RequestMapping( value="/addSchedule", method=RequestMethod.POST )
	public JSONResult addSchedule(@ModelAttribute CalendarVo scheduleVo) {
		
		System.out.println(scheduleVo.getEndDate()+"tttttttttttttttttttttttttt"+scheduleVo.getStartDate()+"ttttt"+scheduleVo.getScheduleContent());
		int count = calendarService.addSchedule(scheduleVo);
		return JSONResult.success(count);
	}

}
