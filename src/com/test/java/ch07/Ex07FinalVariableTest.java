package com.test.java.ch07;

import java.util.Scanner;

public class Ex07FinalVariableTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book61 b3 = new Book61();
		System.out.println("가격을 입력하세요: ");
		b3.price = scan.nextInt();
		int price2 = b3.taxPrice();
		System.out.println("세율이 적용된 가격: " + price2);
		
		
	}

}


class Book61 {
	int price;
	final static float BOOKSTORE_TAX = 1.5f;
	
	int taxPrice() {
	return price + (int)(price * BOOKSTORE_TAX);
	
	
	
	}
}

/*
문제 1.
책의 세율을 final로 설정한뒤 세율이 적용된 책의 가격을 출력하는 코드를 작성하세요. 
*/