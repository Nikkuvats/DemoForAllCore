package com.languageFundamentals.Array;

class ArrayDemo {
	public static void main(String[] args) {

		int[] s[], b[]; // a2b1
		int[] c, d; // c1d1
		int[] e[], f[]; // e2f2
		
		int [] []x, y[];

		// intx[][]; Name should be completely separate from the type
		// int [6]x; can not specified size at the time of declaration
		// int []x[] y[]; can not define two name for single array declaration
		// int[] []l, []m; variable name must be behind array
		
		 int[] g[], h[]; // g2h3
		
		int[] age = new int[5];

		for (int i = 0; i < age.length; ++i) {
			System.out.println(age[i]);
		}

		int[][] two = { { 10, 20 }, { 30, 40, 50 } };
		System.out.println(two[0][1]);
	}
}