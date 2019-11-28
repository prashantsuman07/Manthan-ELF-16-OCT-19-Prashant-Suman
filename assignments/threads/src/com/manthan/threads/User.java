package com.manthan.threads;

public class User extends Thread {
	Pvr p;

	public User(Pvr p) {
		this.p = p;
	}
	public void run() {
		p.confirm();
		
	}
	

}
