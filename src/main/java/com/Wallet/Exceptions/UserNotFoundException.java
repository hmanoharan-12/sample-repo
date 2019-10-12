package com.Wallet.Exceptions;


public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Message;
	
	public UserNotFoundException() {
		  super();
		
	}
	
	public UserNotFoundException(String message ) {
		  super();
		  Message = message;
		}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	
}
