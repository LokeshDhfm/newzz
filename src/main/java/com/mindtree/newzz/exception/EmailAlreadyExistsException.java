package com.mindtree.newzz.exception;

public class EmailAlreadyExistsException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailAlreadyExistsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EmailAlreadyExistsException(String arg0) {
		super(arg0);
	}

	
}
