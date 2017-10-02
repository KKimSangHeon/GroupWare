package com.sangehon.groupware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sangehon.groupware.service.FileUploadService;
import com.sangehon.groupware.service.UserService;
import com.sangheon.groupware.dto.JSONResult;
import com.sangheon.groupware.vo.MessageVo;
import com.sangheon.groupware.vo.UserVo;
import com.sangheon.security.Auth;

@Controller
@RequestMapping( "/user" )
public class UserController {
	

	@Autowired
	private FileUploadService fileUploadService;
	
	@Autowired
	private UserService userService;
	

	
	@RequestMapping( value="/join", method=RequestMethod.GET )
	public String join() {
		return "user/join";
	}

	@RequestMapping( value="/join", method=RequestMethod.POST )
	public String join( @ModelAttribute UserVo userVo,
			@RequestParam( "file" ) MultipartFile file) {
		
		userVo.setImageUrl(fileUploadService.restore(file));
		userService.join(userVo);
		
		return "redirect:/user/joinsuccess";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	
	@RequestMapping( "/wrongaccess" )
	public String wrongAccess() {
		return "user/wrongaccess";
	}
	
	@RequestMapping( "/notapproval" )
	public String notApproval() {
		return "user/notapproval";
	}
	
	@RequestMapping( "/joinsuccess" )
	public String joinSuccess() {
		return "user/joinsuccess";
	}
	
	@Auth(role=Auth.Role.ADMIN)
	@RequestMapping( "/admin" )
	public String adminPage() {
		return "user/admin";
	}
	
	@ResponseBody
	@RequestMapping( value="/searchnotapproved", method=RequestMethod.POST )
	public JSONResult view(@ModelAttribute UserVo userVo) {
		List<UserVo> list = userService.getNotApproved();
		return JSONResult.success(list);
	}
	
	@ResponseBody
	@RequestMapping( value="/approve", method=RequestMethod.POST )
	public JSONResult approveJoin(@ModelAttribute UserVo userVo) {
		int count = userService.approveJoin(userVo);
		return JSONResult.success(count);
	}
}
