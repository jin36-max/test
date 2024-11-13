package com.test.java.ch07;

public class Ex12BookTest {
	String title;
	String author;
	int price;
	
	Ex12BookTest(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	int changePrice(int price2) {
		price = price2;
		return price;
	}
	void changePrice2(Ex12BookTest book, int price3) {
		price = price3;
		return;
		
	}
	
}

