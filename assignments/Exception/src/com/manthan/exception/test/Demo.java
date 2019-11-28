package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class Demo {
	void run() throws IOException {
		File f=new File("demo.txt");
		try {
		f.createNewFile();
		}
		catch(IOException i) {
			i.printStackTrace();
			throw i;
		}
	}
}
