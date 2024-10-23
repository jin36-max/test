package com.test.java.ch03;

public class Ex05RelationalOperatrosTest {
	
	public static void main(String[] args) {
		
		int a = 300;
		int b = 500;
		int c = 600;
		int tv = 200;
		
		System.out.printf("tv < %d || %d > tv && %d < tv (%b)%n",a , b, c, tv < a || b > tv && c < tv);
	}

}






/*
문제 1.
TV의 가격이 300원 보다 작거나 500원 보다 크고 600원 보다 작은 경우 true를 반환하는 코드를 작성하고 결과를 출력하세요. 
*/