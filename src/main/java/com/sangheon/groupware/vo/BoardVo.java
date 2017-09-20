package com.sangheon.groupware.vo;

public class BoardVo {
	private String id;
	private String name;
	private String boardName;
	private String boardId;
	private String isTeam;
	private String boardAuthority;
	
	
	public String getIsTeam() {
		return isTeam;
	}
	public void setIsTeam(String isTeam) {
		this.isTeam = isTeam;
	}
	public String getBoardAuthority() {
		return boardAuthority;
	}
	public void setBoardAuthority(String boardAuthority) {
		this.boardAuthority = boardAuthority;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
