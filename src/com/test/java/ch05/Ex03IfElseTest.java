package com.test.java.ch05;

import java.util.Scanner;

public class Ex03IfElseTest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int level = 19;
		String name = "계절";
		if (level >= 3 && level <= 5) {
			 name = "봄";
		} else if (level >= 6 && level <= 8) {
			 name = "여름";
		} else if (level >= 9 && level <= 11) {
			 name = "가을";
		} else if (level == 12 || level == 1 || level ==2) {
			 name = "겨울";
		} else {
			 name = "잘못 입력하였습니다.";
		}
		
		System.out.printf("%s", name);
   }

}






/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 작성하세요.  
*/