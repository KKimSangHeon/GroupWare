package com.sangehon.groupware.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangehon.groupware.service.UserService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.UserVo;

@RequestMapping( "/api/user" )
@Controller("userAPIController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping( "/getTeamList" )
	public JSONResult getTeamList() {
		List<UserVo> teamList = 
				userService.getTeamList(  );
		return JSONResult.success( teamList );
	}
	
	@ResponseBody
	@RequestMapping( "/getPositionList" )
	public JSONResult getPositionList() {
		List<UserVo> getPositionList = 
				userService.getPositionList(  );
		return JSONResult.success( getPositionList );
	}
	
}
