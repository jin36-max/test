package com.test.java.ch05;

public class Ex05Switch {
	
	public static void main(String[] args) {
		int level = 5;
		String name = "";
		
		switch (level) {
		    case 2:
		    case 3:
		    case 4:
		        name = "일반회원";
		        break;
		    case 5:
		    case 6:
		    	 name = "중간관리자";
		         break;
		    case 9:
		    	 name = "관리자";
		         break;
		    default:
		    	   name = "방문자";
		    	   
		}
		
		System.out.printf("회원님의 레벨은 %d이며 %s입니다.%n", level, name);
		
		
	}

}
