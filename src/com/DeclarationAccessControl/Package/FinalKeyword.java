package com.DeclarationAccessControl.Package;

public class FinalKeyword {

	public static void main(String[] args) {
	
		m1(10,20);
	}
	
	
	/*public static void m1(final int i,final int j) {
		i = 200;
		j = 300;
		
		System.out.println( i +"   and    " +j);
	}
	*/
	
	public static void m1( int i, int j) {
		i = 200;
		j = 300;
		
		System.out.println( i +"   and    " +j);
	}
}
