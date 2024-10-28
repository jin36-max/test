package com.test.java.ch06;

import java.util.Scanner;

public class Ex07WhileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a = true;
		int total = 1000;
		
		while (a) {
			System.out.println("금액을 입력해주세요.\n 1: 콜라(500원, 2: 사이다(300원), 3: 환타(200원)");
			int money = scanner.nextInt();
			
			if (total < 200) {
				System.out.println("잔액이 부족합니다.");
				a = false;
				
			} else if (money == 500 && total>=500) {
				System.out.println("콜라");
				
			} else if (money == 300 && total>=300) {
				System.out.println("사이다");
				
			} else if (money == 200 && total>=200) {
				System.out.println("환타");
				
			} else 
				System.out.println("잘못 입력하였습니다.");
			
			total -=money;
			
		}
	}
			
}




/*
문제 1.
while문을 사용해 자판기를 만드세요.
1: 콜라 (500원), 2: 사이다(300원), 3: 환타(200원)
잔액은 1000원으로 설정하고 잔액이 부족하면 음료수를 살 수 없어야 합니다.  
*/