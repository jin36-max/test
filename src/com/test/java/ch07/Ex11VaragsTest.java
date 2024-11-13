package com.test.java.ch07;

import java.util.Arrays;

public class Ex11VaragsTest {
	
	public static void main(String[] args) {
		
		Book13 book1 = new Book13();
		book1.title = "자바 문법";
		book1.setAuthor("저자1", "저자2", "저자3", "저자4", "저자5");
		
		Book13.printInfo(book1);
		
	}

}
/*
문제 1.
가변인자를 사용하여 책의 저자를 여러명 설정할 수 있는 코드를 작성하고 결과를 출력하세요. 
*/

class Book13 {
	String title;
	String[] author;
	
	void setAuthor(String...params) {
		author = new String[params.length];
		for (int i=0; i<author.length; i++) {
			author[i] = params[i];
		}
	}
	
	static void printInfo(Book13 book) {
		System.out.printf("책의 저자: %s%n", Arrays.toString(book.author));
	}
}