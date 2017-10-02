package com.sangehon.groupware.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sangehon.groupware.service.FileUploadService;
import com.sangehon.groupware.service.MyPageService;
import com.sangheon.groupware.vo.UserVo;
import com.sangheon.security.Auth;


@Auth
@Controller
@RequestMapping( "/mypage" )
public class MyPageController {

	@Autowired
	private MyPageService myPageService;
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@RequestMapping( "")
	public String mypage() {
		return "mypage/index";
	}
	
	@RequestMapping( value="/modify", method=RequestMethod.POST )
	public String modify( @ModelAttribute UserVo userVo,
			@RequestParam( "file" ) MultipartFile file) {
		
		userVo.setImageUrl(fileUploadService.restore(file));
		myPageService.modify(userVo);
		
		return "redirect:/mypage/";
	}
}
