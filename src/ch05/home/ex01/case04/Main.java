package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;
//과제
//사용자를 생성하라
//user 가 user의 이름, 나이를 수동 입력한다.
//app이 user의 가입일을 자동 입력한다.abstract
//
//이름: gambit
//나이: 25
//
//이름: gambit
//나이: 25
//가입일: 2024-04-22
public class Main {
	public static void main (String[] args) {
		String userName = "";
		int age = 0;
		LocalDate regDate = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힣]+");
			if(!isGood) System.out.println("ERROR] 이름을 입력하세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) age = Integer.parseInt(tmp);
			else System.out.println("ERROR] 나이를 입력하세요.");
		} while(!isGood);
		
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setRegDate(LocalDate.now());
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				 user.getUserName(), user.getAge(), user.getRegDate());
	}
}
