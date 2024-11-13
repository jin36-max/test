package com.test.java.ch07;

public class Ex13CallByValueTest {
	
	public static void main(String[] args) {
		Ex12BookTest book = new Ex12BookTest("자바문법","엘컴퓨터학원", 30000);
		
		System.out.println("책 금액: " + book.price);
		int p = 50000;
		book.changePrice(p);
		
		System.out.println("수정된 책 금액: " + book.price);
	}
	

}

/*
문제 1.
call by value 를 이용해 책의 금액을 수정하는 메소드를 작성하세요.
힌트) 수정된 금액을 return 하세요. 
*/
