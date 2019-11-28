package com.manthan.dt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testc {
	public static void main(String[] args) {
		LocalDateTime td1=LocalDateTime.now();
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy h:m:s a");
		System.out.println(dt.format(td1));
	}
}
