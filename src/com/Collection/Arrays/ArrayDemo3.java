package com.Collection.Arrays;

public class ArrayDemo3 {
	
	public static void main(String[] args) {
	
		int [][] arrs = new int[2][3];
		arrs[0][0] = 1;
		arrs[0][1] = 2;
		arrs[0][2] = 3;
		
		arrs[1][0] = 4;
		arrs[1][1] = 5;
		arrs[1][2] = 6;

		for (int i = 0; i < arrs.length; i++) {
			
			for (int j = 0; j < arrs.length; j++) {
				
			//	System.out.print(arrs[0][2]);
			//	System.out.print(arrs[1][2]);
				System.out.print(arrs[i][j]);
			}
			System.out.println();
		}		
		
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			
		//		System.out.print(arr[i][j]);
			}
		//	System.out.println();
		}
		
	}
}
