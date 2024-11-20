package com.test.java.ch08;

public class Ex03SuperTest {
	
	public static void main(String[] args) {
		
		EBook7 eb2 = new EBook7();
		System.out.println("책의 제목은 [" + eb2.title + "]이고 글자의 색은 [" + eb2.fontColor + "]입니다.");
		
	}

}
/*
문제 1.
기본 생성자가 없는 Book3의 자식 클래스를 만들고
해당 자식 클래스를 이용해 인스턴스를 생성하세요.
힌트) super를 이용하세요.
*/

class Book0 {
	String title;
	String author;
	
	Book0(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class EBook7 extends Book0 {
	String fontColor;
	
	EBook7() {
		super("제목", "저자");
		this.fontColor = "화이트";
		
	}

}