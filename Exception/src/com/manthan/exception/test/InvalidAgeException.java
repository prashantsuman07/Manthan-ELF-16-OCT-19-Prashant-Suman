package com.manthan.exception.test;


public class InvalidAgeException extends Exception {
	String msg="sorry kiddo";
	public InvalidAgeException() {

	}

	public InvalidAgeException(String msg) {
		//super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
