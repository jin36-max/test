package com.test.java.ch04;

public class Ex01Array {
	
	public static void main(String[] args) {
		int[] a;
		a = new int[3];
		a[0] = 10;
		a[1] = 11;
		a[2] = 12; 
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("배열의 길이 : " + a.length);
		
		System.out.println();
		
		int[] arr2 = new int[] {30, 31, 32};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println();
		
		int[] arr3 = {40, 41, 42, 43};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		
		
	}

}
