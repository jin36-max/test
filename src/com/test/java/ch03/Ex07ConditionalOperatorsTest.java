package com.test.java.ch03;

import java.util.Scanner;

public class Ex07ConditionalOperatorsTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance;
		System.out.printf("값을 입력하시오.%n");
		balance = scan.nextInt();
		
		String result = balance > 0 ? "양수" : balance == 0 ? "0" :"음수";
		System.out.println(result);
		
		System.out.printf("%s", balance > 0 ? "양수" : balance == 0 ? "0" : "음수");
		
	}

}




/*
문제 1.
삼항연산자를 사용하여 사용자로 부터 입력 받은 값이 음수인지 양수인지 0인지를 출력하는 코드를 작성하세요. 
*/ 