package com.test.java.ch07;

import java.util.Scanner;
public class Ex03MethodTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculator c1 = new Calculator();
		
		System.out.print("값을 입력하세요: ");
		c1.number = scanner.nextInt();
		System.out.print("값을 입력하세요: ");
		c1.number2 = scanner.nextInt();
		
		c1.plus();
		
		c1.minus();
		
		c1.multiply();
		
		c1.divide();
		
		
	}
}

/*
문제 1.
계산기 클래스를 만들고 더하기, 빼기, 곱하기, 나누기 메소드를 작성한 뒤 메소드를 이용하여 결과를 출력하세요.  
*/

class Calculator {
	int number;
	int number2;
	int result;
	int i;
	
	void plus() {
		result = number + number2;
		System.out.printf("%d + %d = %d%n", number, number2, result);
	}
	
	void minus() {
		result = number - number2;
		System.out.printf("%d - %d = %d%n", number, number2, result);
	}
	
	void multiply() {
		result = number * number2;
		System.out.printf("%d * %d = %d%n", number, number2, result);
	}
	
	void divide() {
		result = number / number2;
		System.out.printf("%d / %d = %d%n", number, number2, result);
	}
	
	
}
