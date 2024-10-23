package com.test.java.ch03;

public class Ex04RelationOperatorsTest {
	
	public static void main(String[] args) {
		
		int tvPrice = 300 , money = 1000;
		boolean result = tvPrice <= money;
		
		System.out.printf("%d < %d (%b)구매가능 %n%n", tvPrice, money, result);
		System.out.printf("%d > %d (%b)구매불가능 %n%n", tvPrice, money, result);
		
		
	
	}

}


/*
문제 1.
TV의 금액은 300원입니다.
잔액이 1000원일 때 TV의 구매 가능 여부를 조건식을 이용하여 출력하세요. 
*/