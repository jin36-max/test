package com.test.java.ch05;

import java.util.Scanner;

public class Ex01IfTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("레벨을 입력하세요: ");
		int level = s.nextInt();
		String grade = "";
		if (level >= 5) {
			grade = "VIP";
		}
		
		String msg = grade + "회원님 안녕하세요.";
		
		System.out.printf(msg);
		
	}

}




/*
문제 1.
로그인한 회원의 레벨이 5 이상이면 "VIP회원님 안녕하세요"를 출력하는 코드를 작성하세요. 
*/
