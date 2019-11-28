package com.manthan.lambda;

public class Facto {
	public static void main(String[] args) {
		

	Factorial f=n -> {
		int a=1;
		for(int i=1;i<=n;i++) {
			i*=i-1;
		}
		return 1;
	};
	int i=f.fact(5);
	System.out.println(i);		
}
}
