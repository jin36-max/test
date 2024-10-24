package com.test.java.ch05;

public class Ex05SwitchTest {
	
	public static void main(String[] args) {
		int level = 9;
		String name = "";
		
		switch(level) {
		     case 3:
		     case 4:
		     case 5:
			     name = "봄 입니다.";
			     break;
		     case 6:
		     case 7:
		     case 8:
		    	 name = "여름 입니다.";
		    	 break;
		     case 9:
		     case 10:
		     case 11:
		    	 name = "가을 입니다.";
		    	 break;
		     case 12:
		     case 1:
		     case 2:
		    	 name = "겨울 입니다.";
		    	 break;
		     default:
		    	 name = "잘못 입력하였습니다.";
		    		 
		}
		
		System.out.printf("%d월이며 %s", level, name);
	}

}


/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요. 
*/