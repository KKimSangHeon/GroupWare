package com.sangheon.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sangehon.groupware.service.UserService;
import com.sangheon.groupware.vo.UserVo;


public class AuthLoginInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private UserService userService;
	
	@Override
	public boolean preHandle(
		HttpServletRequest request, 
		HttpServletResponse response, 
		Object handler)
		throws Exception {

		String employeeNo = request.getParameter( "employeeNo" );
		String password = request.getParameter( "password" );
		
		
		UserVo userVo = userService.getUser(employeeNo, password);
		
		if( userVo == null ) {
			response.sendRedirect( request.getContextPath() + "/user/login" );
			return false;
		}
		
		// session 처리
		HttpSession session = request.getSession( true );
		session.setAttribute( "authUser", userVo );
		response.sendRedirect( request.getContextPath()+"/board" );

		return false;
	}

}
