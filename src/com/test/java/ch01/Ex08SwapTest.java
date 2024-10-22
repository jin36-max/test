package com.test.java.ch01;

public class Ex08SwapTest {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int c = 70;
		int d = 100;
		System.out.printf("a의 값은 %d 이고 b의 값은 %d이고 C의 값은 %d이고 d의 값은 %d 입니다.%n%n", a, b, c, d);
		
		/*int tmp = a;
		int tmp1 = b;
		a = c;
		b = tmp;
		c = tmp1;*/
		
		int tmp = a;
		a = b;
		b = c;
		c = d;
		d = tmp;
		
		System.out.printf("a의 값은 %d 이고 b의 값은 %d이고 C의 값은 %d d의 값은 %d 입니다.%n%n", a, b, c, d);
		
	}

}



/*
문제 1.
int a = 50;
int b = 30;
int c = 70;
swap알고리즘을 사용하여 세 변수의 값을 바꿔 주세요. 
*/