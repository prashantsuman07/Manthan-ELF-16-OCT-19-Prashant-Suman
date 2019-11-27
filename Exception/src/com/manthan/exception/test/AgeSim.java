package com.manthan.exception.test;

public class AgeSim {
	void verify(int age) throws InvalidAgeException
	{
		if(age<18) {
			InvalidAgeException a=new InvalidAgeException();
			throw a;
		}
	}

}
