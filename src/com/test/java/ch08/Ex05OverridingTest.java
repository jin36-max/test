package com.test.java.ch08;

public class Ex05OverridingTest {
	
	public static void main(String[] args) {
		EBook6 eb = new EBook6();
		eb.setTitle("제목을 입력하세요.");
		eb.printTitle();
		
	}

}
/*
문제 1.
제목 설정 메소드를 부모클래스와 자식클래스에 모두 작성하고 자식클래스의 제목 설정 메소드는 제목에 [이북]이 추가되도록 작성하세요.
부모의 타이틀과 자식의 타이틀 모두 출력하세요. 
*/

class Book12 {
	String title;
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void printTitle() {
		System.out.println("책의 제목: " + title);
	}
}

class EBook6 extends Book12 {
	String title;
	String EbTitle;
	
	@Override
	void setTitle(String title) {
		super.setTitle(title);
		this.title = "[이북]" + title;
		//this.EbTitle = title;
	}
	
	@Override
	void printTitle() {
		super.printTitle();
		System.out.println("추가된 책의 제목: " + title);
	}
	
}
