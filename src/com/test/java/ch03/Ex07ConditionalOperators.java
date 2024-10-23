package com.test.java.ch03;

public class Ex07ConditionalOperators {
	
	public static void main(String[] args) {
		int score = 70;
		
		String result = score >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
		score = 48;
		System.out.printf("%s%n", score >= 60 ? "합격" : "불합격");
		
	}

}
