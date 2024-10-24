package com.test.java.ch05;

import java.util.Scanner;

public class Ex04IfElseTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int level = s.nextInt();
		String name = "계절";
		
		if (level == 1 || level == 2 || level == 12) {
			name = "겨울";
		} else if (level >= 3 && level < 6) {
			name = "봄";
		} else if (level >= 6 && level < 9) {
			name = "여름";
			if (level == 8) {
				name = name + "휴가철";
			}
		} else if (level >= 9 && level < 12) {
			name = "가을";
		} else {
			name = "없는 계절 입니다.";
		}
		
		System.out.printf("지금은 %d월달이고 %s입니다.",level, name );
	}

}


/*
문제 1.
사용자가 입력한 숫자에 맞는 계절을 출력하되 8월을 입력하면 "휴가철"도 같이 출력되게 작성하세요.
힌트) 중첩 if문을 사용하세요.  
*/