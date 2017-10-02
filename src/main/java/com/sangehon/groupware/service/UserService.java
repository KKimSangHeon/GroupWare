package com.sangehon.groupware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangheon.groupware.repository.UserDao;
import com.sangheon.groupware.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean join( UserVo userVo ) {
		return userDao.insert( userVo ) == 1;
	}
	
	public UserVo getUser(String no) {
		return userDao.get(no);
	}
	
	public UserVo getUser(String no,String password) {
		return userDao.get(no,password);
	}
	
	public int updateLoginTime(String no) {
		return userDao.updateLoginTime(no);
	}
	
	public List<UserVo> getTeamList(){
		return userDao.getTeamList();
		
	}	
	public List<UserVo> getPositionList(){
		return userDao.getPositionList();
		
	}
	public List<UserVo> getNotApproved(){
		return userDao.getNotApproved();
		
	}
	
	public int approveJoin(UserVo userVo) {
		return userDao.approveJoin(userVo);
	}
}
