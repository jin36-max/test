package com.test.java.ch07;

public class Ex10ThisConstructorTest {
	
	static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2.carInfo(c1);
		
		Car2 c2 = new Car2("쏘나타");
		Car2.carInfo(c2);
		
		Car2 c3 = new Car2("아반떼", 220);
		Car2.carInfo(c3);
		
		Car2 c4 = new Car2("자동차", 300, "기아");
		Car2.carInfo(c4);
		
	}

}
/*
문제 1.
this생성자를 사용하는 코드가 포함된 임의의 클래스를 작성하고 
각각의 생성자를 이용해 인스턴스 생성후 값들을 출력하는 코드를 작성하세요.
*/

class Car2 {
	String name;
	int maxSpeed;
	String company;
	
	Car2(){
		this("자동차이름", 100, "현대");
	}
	
	Car2(String name){
		this(name, 100, "현대");
	}
	
	Car2(String name, int maxSpeed){
		this(name, maxSpeed, "현대");
	}
	
	Car2(String name, int maxSpeed, String company){
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.company = company;
	}
	
	
	static void carInfo(Car2 car) {
		System.out.printf("이름: %s%n최대속력: %d%n회사: %s%nn", car.name, car.maxSpeed, car.company);
		
	}
}