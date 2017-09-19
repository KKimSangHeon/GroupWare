package com.sangehon.groupware.exception;

public class UserDaoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserDaoException() {
		super( "UserDao Exception occurs" );
	}

	public UserDaoException( String message ) {
		super(message);
	}
	
}
