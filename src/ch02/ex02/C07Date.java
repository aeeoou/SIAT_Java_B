package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 4, 9);
		LocalTime time = LocalTime.of(12, 12, 55);
		
		System.out.println(date);
		System.out.println(time);
	}
}
