package com.test.java.ch06;

public class Ex01ForTest {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			System.out.println(i*2);
		}
		System.out.println();
		
		for (int i ; i++) {
			int[] arr2 = { i, i+30, i+50 };
			
			
		}
	}

}



/*
문제 1.
구구단 중 2단만 출력하세요.
예) 
2x1=2 2x2=4 ... 2x9=18

문제 2.
학생 3명의 중간고사 점수가 저장된 배열을 만들고 임의의 점수를 저장한 뒤
for 문을 사용하여 출력하세요.

문제 3.
중간고사 점수가 저장된 배열의 점수를 출력하되 점수가 60점 이상일 경우에만 출력하고 60점 미만일 경우 "재시험"을 출력하는 코드를 작성하세요. 
*/