package com.sangehon.groupware.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangehon.groupware.service.SearchEmployeeService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.UserVo;
import com.sangheon.security.Auth;
@Auth
@Controller
@RequestMapping( "/searchemployee" )
public class SearchEmployeeController {
	
	@Autowired
	private SearchEmployeeService searchEmployeeService;
	
	
	@RequestMapping( "")
	public String mypage() {
		return "searchemployee/index";
	}
	
	@ResponseBody
	@RequestMapping( value="", method=RequestMethod.POST )
	public JSONResult view(@ModelAttribute UserVo userVo) {
		
		List<UserVo> list = searchEmployeeService.getEmployeeList(userVo);
		
		return JSONResult.success(list);
	}
}
