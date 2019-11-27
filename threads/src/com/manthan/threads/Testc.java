package com.manthan.threads;

public class Testc {
	public static void main(String[] args) {
		Pvr p=new Pvr();
		User t1=new User(p);
		t1.start();
		//t1.start();
		User t2=new User(p);
		t2.start();
		
	}
}
