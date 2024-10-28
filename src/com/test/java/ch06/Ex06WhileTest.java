package com.test.java.ch06;

public class Ex06WhileTest {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		while( i < 10) {
			
			while( j < 10) {
				System.out.printf("%d x %d = %d ", i, j, i*j );
				j++;
			}
			System.out.println();
			j=1;
			i++;
		}

		
		
		
	}

}


/*
문제 1.
while문도 for문처럼 중첩시킬 수 있습니다. 
중첩 while문을 이용해 구구단을 출력하세요. 
*/