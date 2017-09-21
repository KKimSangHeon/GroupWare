package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.SearchEmployeeDao;
import com.sangheon.groupware.vo.UserVo;

@Service
public class SearchEmployeeService {

	@Autowired
	private SearchEmployeeDao searchEmployeeDao;
	
	
	public List<UserVo> getEmployeeList(UserVo userVo) {
		List<UserVo> list = searchEmployeeDao.getEmployeeList(userVo);
		
		return list;
	}
	
}
