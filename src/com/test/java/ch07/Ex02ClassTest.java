package com.test.java.ch07;

import java.util.Scanner;

public class Ex02ClassTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Book36[] books = new Book36[10];
		int bookCount = 0;
		
		System.out.println("도서관리 프로그램");
		
		while(true) {
			System.out.println("-------------");
			System.out.println("메뉴를 선택하세요. 1:책등록, 2:책목록, 0:종료");
			System.out.print(">>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			if (menu == 0) {
				break;
			}
			
			switch(menu){
				case 1:
					 if (bookCount < books.length) {
	                        Book36 book = new Book36(); 
	                        System.out.println("책을 등록하세요.");
	                        System.out.print("제목: ");
	                        book.title = scanner.nextLine();
	                        System.out.print("저자: ");
	                        book.author = scanner.nextLine();
	                        System.out.print("가격: ");
	                        book.price = scanner.nextInt();
	                        scanner.nextLine(); 

	                        books[bookCount++] = book; 
	                        System.out.printf("등록된 책 - 제목: %s, 저자: %s, 가격: %d원%n", book.title, book.author, book.price);
	                    } else {
	                        System.out.println("더 이상 책을 등록할 수 없습니다.");
	                    }
	                    break;

	                case 2: 
	                    if (bookCount == 0) {
	                        System.out.println("등록된 책이 없습니다.");
	                    } else {
	                        System.out.println("책의 목록을 확인합니다.");
	                        for (int i = 0; i < bookCount; i++) {
	                            System.out.printf("제목: %s, 저자: %s, 가격: %d원%n",
	                                    books[i].title, books[i].author, books[i].price);
	                        }
	                    }
	                    break;

	                default: // 잘못된 메뉴 선택
	                    System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 시도하세요.");
	                    break;
	        }

	   }

	     System.out.println("프로그램이 종료됩니다.");
	     scanner.close();
	}
}

class Book36 {
	String title;  
	String author; 
	int price;     
}
					


/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/