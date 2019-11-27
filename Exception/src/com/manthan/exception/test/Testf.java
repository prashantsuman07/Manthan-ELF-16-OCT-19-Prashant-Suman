package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class Testf {

	public static void main(String[] args) {
		System.out.println("main started");
		File f=new File("abc.txt");
		try {
			f.createNewFile();
			System.out.println(f.getAbsolutePath());
			System.out.println("file created");
		}
		catch(IOException i) {
			System.out.println("sorry cant create");
		}
		System.out.println("main stop");
	}
}
