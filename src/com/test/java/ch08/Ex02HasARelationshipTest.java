package com.test.java.ch08;

public class Ex02HasARelationshipTest {
	
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.name = "투싼";
		c1.company = "현대차";
		c1.price = 40000000;
		
		Car2 c2 = new car2();
		c2.name = "스포티지";
		c2.company = "기아차";
		c2.price = 38000000;
		
		Cart cart2 = new Cart();
		cart.putCar(c1);
		
		Cart.print(C1);
		
		
	}

}

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. 
*/

