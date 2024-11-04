package com.test.java.ch07;

public class Ex06ClassMethodTest {
	
	public static void main(String[] args) {
		Book51.bookNo = Book51.genBookNo();
		System.out.println(Book51.bookNo);
		
		Book51.price = Book51.changeDollar(15000);
		System.out.println(Book51.price + "$");
		
		System.out.println();
		
		Book51.bookNo = Book51.genBookNo();
		System.out.println(Book51.bookNo);
		
		Book51.price = Book51.changeDollar(30000);
		System.out.println(Book51.price + "$");
		
		
		
	}

}

class Book51 {
	String title;
	static int bookNo;
	static int price;
	
	static int genBookNo() {
		bookNo = (int)(Math.random()*9000)+1000;
		return bookNo;
	}
	static int changeDollar(int price) {
		int exchange = 1000;
		return price / exchange;
		
		
	}
}


	

/*
문제 1.
	주석처리된 코드의 오류를 수정하세요.

문제 2.
책의 가격을 달러로 변환하여 리턴하는 클래스 메소드를 작성하세요.
1달러=1000원으로 가정합니다. 
*/