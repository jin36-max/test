package com.test.java.ch07;

import java.util.Scanner;

public class Ex02ClassTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리 프로그램");
		
		class Book{
			String title;
			String author;
			int price;
		}
		
		Book[] books = new Book[10];
		
		boolean run = true;
		
		int bookCount = 0;
		
		
		while(true) {
			System.out.println("-------------");
			System.out.println("메뉴를 선택하세요. 1:책등록, 2:책목록, 0:종료");
			System.out.print(">>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			switch(menu){
				case 1:
					Book book1 = new Book();
					System.out.println("책을 등록하세요.");
					System.out.print("제목:");
					book1.title = scanner.nextLine();
					System.out.print("저자:");
					book1.author = scanner.nextLine();
					System.out.print("가격:");
					book1.price = scanner.nextInt();
					System.out.printf("제목:%s, 저자:%s, 가격:%d%n", book1.title, book1.author, book1.price);		
					
					books[bookCount++] = book1;
					break;
				case 2:
					System.out.println("책의 목록을 확인합니다.");
					
					for(int i=0; i<bookCount; i++) {
						System.out.printf("제목:%s 저자:%s, 가격:%d%n", books[i].title, books[i].author, books[i].price);
					}
					break;
				case 0:
					run = false;
					break;										
			}
			if(!run)
				break;
		}
		System.out.println("프로그램이 종료됩니다.");
		
	}

}



/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/