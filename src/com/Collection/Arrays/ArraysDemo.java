package com.Collection.Arrays;

class ArraysDemo {
	public static void main(String[] args) {
		
		int y[] = new int[0];
	//  System.out.println(y.length);
		
	//	int z[] = new int[-7];
	//	System.out.println(z.length); Array can not specify for size
		
		int m[] = new int['A'];
		
	//	int m[] = new int[A]; compile time error
		
		int x[] = { 2, 1, 5, 4, 3, 6 };	
		for (int i = 0; i < x.length; i++) {
		//System.out.println(x[i]);
		}
		
		int []a[]  = new int[2][2];
		a[0][0] = 3;
		a[0][1] = 4;
	//	a[0][3] = 7; 03 is not the element of array
		a[1][1] = 5;
		a[1][0] = 6;
	//	System.out.println(a[0][0]);
		
		int v[] = new int[5];
		for (int i = 0; i < v.length; i++) {
		//	v[i] = new Arrays();
		}
		System.out.println(v[2]);
		
		int [][][]b = new int[1][1][4];
		b[0][0][0] = 1;
		b[0][0][1] = 2;
		b[0][0][2] = 3;
		b[0][0][3] = 4;
	//	b[0][1][0] = 5; // 010 is not a element of array
		
		for (int i = 0; i < b.length; i++) {
	//		System.out.println(b[0][1][0]);
		}
		
		int c[][][] = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
	}
}