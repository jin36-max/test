package com.test.java.ch03;

import java.util.Scanner;

public class Ex01ArithemeticOperatorTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tv;
		int tvPrice;
		
		System.out.printf("Tv수량을 입력하세요.%n");
		tv = scan.nextInt();
		System.out.printf("Tv금액을 입력하세요.%n");
		tvPrice = scan.nextInt();
		
		int sum = tv * tvPrice;
		System.out.printf("%n%d * %d = %d", tv, tvPrice, sum );
		
	}

}

/*
문제 1.
TV의 수량과 금액을 입력 받고 총액을 출력하세요. 
 */