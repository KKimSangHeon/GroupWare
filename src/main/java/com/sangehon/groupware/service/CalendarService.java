package com.sangehon.groupware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.CalendarDao;

@Service
public class CalendarService {

	@Autowired
	private CalendarDao calendarDao;

	
	
}
