 package com.test.java.ch04;

public class Ex02Array {

	public static void main(String[] args) {
		/*
		 {
		      {70, 80}
		      {30, 90}
		      {100, 20}
		      
		 }
		 */
		int arr[][] = new int[3][2];
		arr[0][0] = 70;
		arr[0][1] = 80;
		arr[1][0] = 30;
		arr[1][1] = 90;
		arr[2][0] = 100;
		arr[2][1] = 20;
		
		System.out.println("학생별 구거, 영어 점수");
	    System.out.print("영희:" + arr[0][0] + "," + arr[0][1] + "\n");
	    System.out.print("철수:" + arr[1][0] + "," + arr[1][1] + "\n");
	    System.out.print("둘리:" + arr[2][0] + "," + arr[2][1] + "\n");
	    
	    System.out.println("");
	    
	    int[][][] arr3 = {
	    		{
	    			{90, 95},
	    			{80, 97}		
	    		},
	    		{
	    			{88, 75},
	    			{85, 100}
	    		}
	    };
	   System.out.println("반별 학생별 국어, 영어 점수");
	   System.out.println("1반 영희:" + arr3[0][0][0] + "," + arr3[0][0][1] + "\n");
	   System.out.println("1반 철수:" + arr3[0][1][0] + "," + arr3[0][1][1] + "\n");
	   System.out.println("2반 둘리:" + arr3[1][0][0] + "," + arr3[1][0][1] + "\n");
	   System.out.println("2반 길동:" + arr3[1][1][0] + "," + arr3[1][1][1] + "\n");
	   System.out.println("");
	   
	   int[][] arr4 = {
			   
			   {1, 3, 5},
			   {7, 9},
			   {10, 11, 12, 13}
			   
	   };
	   
	  System.out.println("2차원 배열의 길이: " + arr4.length);
	  System.out.println("1차원 배열의 길이" + arr4[0].length);
	  System.out.println("1차원 배열의 길이" + arr4[1].length);
	  System.out.println("1차원 배열의 길이" + arr4[2].length);
	    
	    
	}
}
