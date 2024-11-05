package com.test.java.ch07;

public class Ex09ConstructorTest {
	
	public static void main(String[] args) {
		
		Movie m0 = new Movie();
		m0.printInfo();
		
		Movie m1 = new Movie("영화이름");
		m1.printInfo();
		
		Movie m2 = new Movie("영화이름2", 2);
		m2.printInfo();
		
		Movie m3 = new Movie("영화이름3", 3, "장르2");
		m3.printInfo();
		
		
	}

}
/*
문제 1.
영화 제목(문자열), 상영시간(정수), 장르(문자열) 속성을 가진 클래스를 만들고 
생성자를 이용하여 속성을 설정한 뒤 출력하세요.

문제 2.
생성자 오버로딩을 이용해 생성자 세개를 추가하고
각각의 생성자를 이용하여 3개의 인스턴스를 생성후 정보를 출력하세요.  
*/

class Movie {
	String name;
	int runTime;
	String genre;
	
	Movie(){
		this.name = "영화이름";
		this.runTime = 0;
		this.genre = "영화장르";
	}
	
	Movie(String name){
		this.name = name;
		this.runTime = 1;
		this.genre = "액션";
	}
	
	Movie(String name, int runTime){
		this.name = name;
		this.runTime = runTime;
		this.genre = "로맨스";
		
	}
	
	Movie(String name, int runTime, String genre){
		this.name = name;
		this.runTime = runTime;
		this.genre = genre;
	}
	
	void printInfo() {
		System.out.printf("제목: %s%n상영시간: %d%n장르: %s%n%n", name, runTime, genre);
	}
}







