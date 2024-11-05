package com.test.java.ch07;

public class Ex05ClassVariableTest {
	
	public static void main(String[] args) {
		Book100.ct = "문화";
		Book100 b1 = new Book100();
		b1.title = "자바문법";
		b1.price = 50000;
		
		Book100 b2 = new Book100();
		b2.title = "C문법";
		b2.price = 30000;
		
		b1.printInfo();
		b2.printInfo();
		System.out.println();
		
		Book100.ct = "도서";
		b1.printInfo();
		b2.printInfo();
		
		
	}

}

/*
문제 1.
책 클래스에 카테고리를 저장할 수 있는 속성(변수)을 추가하세요.
카테고리를 "문화" 에서 "도서"로 변경해 주세요.
카테고리 변경 시 모든 인스턴스에 동일하게 적용되도록 코딩 후 적용된 결과를 출력하세요. 
*/

class Book100 {
	String title;
	int price;
	static String ct;
	
	void printInfo() {
		String message = "책이름: " + title + ", 책가격: " + price + ", 카테고리: " + ct;
		System.out.println(message);
		
	}
		
}
	
