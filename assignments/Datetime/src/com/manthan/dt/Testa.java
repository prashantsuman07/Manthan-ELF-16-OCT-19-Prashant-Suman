package com.manthan.dt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Testa {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	LocalTime td=LocalTime.now();
	System.out.println(td);
	LocalDateTime td1=LocalDateTime.now();
	System.out.println(td1);
}
}
