package com.test.java.ch07;

import java.util.Arrays;
import java.util.Scanner;
public class Ex04MetohdTest {
	
	public static void main(String[] args) {
		BookTest book = new BookTest();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요:");
		book.price = scanner.nextInt();
		
		int bookprice = book.getPrice();
		System.out.println("책의 가격:" + bookprice);
		System.out.println();
		
		BookTest book2 = new BookTest();
		book.setPrice(15000);
		book2.setPrice(300000);
		
		System.out.println("책금액:" + book.price);
		
		String[] au = {"둘리", "또치"};
		book.setAuthors(au);
		
		System.out.println("--- 저자 ---");
		System.out.println(Arrays.toString(book.getAuthors()));
		
		
		
	}

}

class BookTest {
	int price;
	String [] authors = new String[3];
	
	int getPrice() {

		if (price <= 0)
			return 0;
		else 
		    return price;
	}
	
	void setPrice(int price) {
		if (price >= 10000 && price < 80000) {
			this.price = price;
			System.out.println("책의 가격:" + price);
		}else
			System.out.println("설정 가능하지 않은 가격입니다.");
	}
	
	void setAuthors(String [] authors) {
//		this.authors = authors;
		for(int i=0; i<authors.length; i++) {
			this.authors[i] = authors[i];
			
		}
		
	}
	
	String[] getAuthors() {
		return authors;

		if (price >= 10000 && price < 80000) {
			
		} else System.out.println("설정 가능하지 않은 가격입니다.");
		
		return price;
	}
	
}
	


/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.

문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.

문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/