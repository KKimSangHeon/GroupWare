package com.sangehon.groupware.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler( Exception.class )
	public ModelAndView handlerException(Exception e) {
		
		//1. 로깅(파일, DB)
		StringWriter errors = new StringWriter();
		e.printStackTrace(new PrintWriter(errors) );
		//log.error( errors.toString() );
		
		//2. 사과 페이지 안내
		ModelAndView mav = new ModelAndView();
		mav.addObject( "exception", errors.toString() );
		mav.setViewName( "error/exception" );
		return mav;
	}
}
