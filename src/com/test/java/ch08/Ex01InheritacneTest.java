package com.test.java.ch08;

public class Ex01InheritacneTest {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.price = 1000000;
		System.out.println("자동차의 가격은(세금포함):" + car.getPrice());
		
		System.out.println();
		
		ForeignCar fCar = new ForeignCar();
		fCar.price = 50000000;
		System.out.println("자동차의 가격은(세금포함):" + fCar.getPrice());
		String[] category = {"포르쉐", "벤츠", "아우디"};
		
		fCar.category2 = category;
		fCar.printCategory();
		
		System.out.println();
		
		DomesticCar dCar = new DomesticCar();
		dCar.price = 30000000;
		dCar.discount = 0.5;
		System.out.println("국산차의 가격은(할인 적용): " + dCar.getPrice2());

	}
}
/*
문제 1.
생각나는 개체를 클래스로 만들되 부모 자식 클래스로 나누어 주세요.
자식 클래스는 두 개 이상 만들어 주세요. 
모든 클래스에 속성(인스턴스 변수)과 기능(메소드)을 하나 이상 만들어 주세요.  
*/

class Car {
	String name;
	String company;
	int price;
	
	int getPrice() {
		int taxPrice = (int)(price * 1.5);
		return taxPrice;
	}
}

class ForeignCar extends Car {
	String[] category2;
	
	
	void printCategory() {
		System.out.println("목록");
		for (int i=0; i<category2.length; i++) {
			System.out.println("타입" + (i+1) + ":" + category2[i]);
		}
	}
}

class DomesticCar extends Car {
	double discount;
	
	double getPrice2() {
		int discountPrice = (int)(price * (1 - discount));
		return discountPrice;
	}
}
	




