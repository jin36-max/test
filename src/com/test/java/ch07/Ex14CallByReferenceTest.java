package com.test.java.ch07;

public class Ex14CallByReferenceTest {
	
	public static void main(String[] args) {
		Ex12BookTest book = new Ex12BookTest("자바문법","엘컴퓨터학원", 50000);
		
		System.out.println("책 금액: " + book.price);
		
		book.changePrice2(book);
		
		System.out.println("수정된 책 금액: " + book.price);
	}
}
/*
문제 1.
call by reference 를 이용해 책의 금액을 수정하는 메소드를 코딩하세요. 
*/