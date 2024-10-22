package com.test.java.ch01;

public class Ex04VariableTest {
	
	public static void main(String[] args) {
		int balance = 5000;
		System.out.println("현재 잔액은 " + balance + "원 입니다." );
		System.out.println();
		
		int tvPrice = 500;
		System.out.println("TV는 " + tvPrice + "원 입니다.");
		System.out.println("TV를 구매하였습니다.");
		
		System.out.println();
		
		int cPrice = 300;
		System.out.println("Computer는 " + cPrice + "원 입니다.");
		System.out.println();
		
		int salary = 500;
		System.out.println("월급 " + salary + "원이 입금되었습니다.");
		
		balance = balance - (tvPrice + cPrice) + salary;
		System.out.println("현재 잔액은 " + balance + "원입니다.");
		
	}

}

/* 

문제 1. 5000원의 잔액에서 TV(500원)와 컴퓨터(300원)를 구매 후 500원의 월급이 입금되는 코드를 작성하세요. 
 
*/ 