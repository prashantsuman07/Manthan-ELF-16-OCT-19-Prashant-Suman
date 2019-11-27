package com.manthan.threads;

public class MyTask extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
