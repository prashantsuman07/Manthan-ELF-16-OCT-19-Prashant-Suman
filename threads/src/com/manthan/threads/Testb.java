package com.manthan.threads;

public class Testb {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("thtread starrt");
		MyTask m=new MyTask();
		m.start();
		MyTask m1=new MyTask();
		m1.start();
		m.join();
		System.out.println("thtread sended");
		}

}
