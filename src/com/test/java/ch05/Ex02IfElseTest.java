package com.test.java.ch05;

import java.util.Scanner;

public class Ex02IfElseTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("값을 입력하세요%n");
		
		int level = s.nextInt();
		String name ="안녕하세요.";
		
		if (level > 3) {
			 System.out.printf("정회원님 %s%n", name );
		} else {
			 System.out.printf("회원님 %s", name);
		}
   }

}






/*
문제 1.
사용자에게 입력 받은 레벨이 3 보다 크다면 "정회원님 안녕하세요."를 출력하고
3보다 작다면 "회원님 안녕하세요."를 출력하는 코드를 작성하세요. 
*/