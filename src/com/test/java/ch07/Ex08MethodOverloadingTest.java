package com.test.java.ch07;

public class Ex08MethodOverloadingTest {
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setInfo2("쏘나타");
		System.out.println(car.getInfo2());
		
		car.setInfo3(220);
		System.out.println(car.getInfo3());
		
		car.setInfo4("현대");
		System.out.println(car.getInfo4());
		
		System.out.println();
		
		car.setInfo("아반떼", 200, "현대");
		System.out.println(car.getInfo());
		
	}	

}
/*
문제 1.
자동차 정보 자동차이름(문자열), 최대속도(정수), 자동차회사(문자열) 를 저장하는 클래스를 만들고
각각의 속성을 설정하는 메소드를 작성 후 출력하세요.

문제 2.
속성을 설정하는 메소드를 오버로딩을 사용하여 작성 후 출력하세요. 
*/
class Car {
	String name;
	int maxSpeed;
	String company;
	
	void setInfo2(String name) {
		this.name = name;
	}
	String getInfo2() {
		return name;
	}
	
	void setInfo3(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	int getInfo3() {
		return maxSpeed;
	}
	void setInfo4(String company) {
		this.company = company;
	}
	String getInfo4() {
		return company;
	}
	

	void setInfo(String name, int maxSpeed, String company ) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.company = company;
	}
	
	String getInfo() {
		return "이름: " + name + "\n최대속도: " + maxSpeed + "km/h" + "\n회사: " + company + "\n";
	}
}