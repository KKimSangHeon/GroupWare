package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.CalendarDao;
import com.sangheon.groupware.vo.CalendarVo;

@Service
public class CalendarService {

	@Autowired
	private CalendarDao calendarDao;

	public int addSchedule(CalendarVo scheduleVo) {
		int result = calendarDao.addSchedule(scheduleVo);
		
		return result;
	}
	
	public List<CalendarVo> getSchedule(CalendarVo scheduleVo){
		
		return calendarDao.getSchedule(scheduleVo);
	}
	
}
