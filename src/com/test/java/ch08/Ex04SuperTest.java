package com.test.java.ch08;

public class Ex04SuperTest {
	
	public static void main(String[] args) {
		Parent parent2 = new Parent();
		Child child2 = new Child();
		
		
	}

}
/*
문제 1.
this와 super에 대해 설명할 수 있는 코드를 작성하세요.
*/

class Parent {
	String name = "부모";
	
	void printInfo() {
		System.out.println("이것은 부모 클래스 입니다.");
	}
	
}

class Child extends Parent {
	String name = "자녀";
	
	void printInfo2() {
		System.out.println("이것은 자녀 클래스 입니다.");
	}
	
}