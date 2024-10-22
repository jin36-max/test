package com.test.java.ch01;

public class Ex06PrintfTest {
	public static void main(String[] args) {
		int balance = 10;
		System.out.printf("슈퍼에는 %d개의 사탕이 있습니다.", balance);
		
		int candyA = 3;
		int candyB = 2;
		System.out.printf("%n철수는 %d개의 사탕을 사고 영희는 %d개의 사탕을 샀습니다.", candyA, candyB);
		
		int candyC = 2;
		System.out.printf("%n둘리는 예전에 사두었던 사탕 %d개를 환불했습니다.", candyC);
		
		balance = balance - (candyA + candyB) + candyC;
		System.out.printf("%n슈펴에 남아있는 사탕의 재고는 %d입니다.", balance);
		
	}

}
