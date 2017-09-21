package com.sangheon.groupware.vo;

public class UserVo {
	private String employeeNo;
	private String teamId;
	private String email;
	private String employeeName;
	private String password;
	private String positionId; // 직급
	private String joinDate;
	private String isAuthority; // 인증여부
	private String lastLogin;
	private String role;
	private String positionName;
	private String imageUrl;
	

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getIsAuthority() {
		return isAuthority;
	}

	public void setIsAuthority(String isAuthority) {
		this.isAuthority = isAuthority;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPosition(String positionId) {
		this.positionId = positionId;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}



	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeenName) {
		this.employeeName = employeenName;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
