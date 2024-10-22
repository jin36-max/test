package com.test.java.ch03;

public class Ex02UnaryOperatorTest {
	
	public static void main(String[] args) {
		int b = 735;
		int c = 525;
		System.out.printf("%d + %d = %d%n%n", b, c, b+c);
		
		int a = 30;
		a = -a;
		System.out.printf("%d", a);
	}

}

/*
문제 1.
735 + 525 를 두 개의 변수에 저장 후 연산하여 출력하세요.

문제 2.
int a = 30;
변수 a의 값을 음수로 출력하세요. 
*/