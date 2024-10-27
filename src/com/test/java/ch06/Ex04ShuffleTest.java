package com.test.java.ch06;

import java.util.Arrays;

public class Ex04ShuffleTest {
	
	public static void main(String[] args){
		int[] arr = new int[45];
		
				for (int i=0; i<arr.length; i++) {
					arr[i] = 1+i;
					System.out.printf("%d ", arr[i]);
				
				}
				System.out.println();
				
				for (int i=0; i<6; i++ ) {
					int n = (int)(Math.random()*45);
					int tmp = arr[i];
					arr[i] = arr[n];
					arr[n] = tmp;	
					System.out.printf("%d ", arr[i]);
				}
				
		
	}
		
}
		
		
/*
문제 1.
로또번호를 저장하는 배열에 for문을 사용하여 1~45까지의 숫자를 저장한 뒤
shuffle 알고리즘을 사용해 배열에 저장돼 있는 값들의 위치를 모두 섞고 
6개의 번호만 출력하는 코드를 작성하세요. 
*/