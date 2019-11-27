package com.manthan.threads;

public class Testd {
	public static void main(String[] args) {
		Pen p=new Pen();
		Thread t1=new Thread(p);
		t1.start();
		t1.stop();
	}
}
