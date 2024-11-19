package com.test.java.ch08;

public class Ex02HasARelationshipTest {
	
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.name = "투싼";
		c1.company = "현대차";
		c1.price = 40000000;
		
		Car2 c2 = new Car2();
		c2.name = "스포티지";
		c2.company = "기아차";
		c2.price = 38000000;
		
		Cart2 cart2 = new Cart2();
		cart2.putCar(c1);
		
		Cart2.print(c1);
		System.out.println();
		Cart2.print(c2);
		
		
	}

}

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. 
*/

class Cart2 {
	Car2 car;		
	
	void putCar(Car2 car) {
		this.car = car;
	}
	
	static void print(Car2 car) {
		System.out.println("- 자동차 -");
		System.out.println(car.print());
	}
}
	

class Car2 {
	String name;
	String company;
	int price;
	
	String print() {
		return "이름:" + name + ", 회사:" + company +", 금액:"+ price;
	}
}
