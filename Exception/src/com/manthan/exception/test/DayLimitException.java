package com.manthan.exception.test;

public class DayLimitException extends RuntimeException {
	String msg="sorry day limit reached";
	public DayLimitException() {

	}

	public DayLimitException(String msg) {
		//super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}

