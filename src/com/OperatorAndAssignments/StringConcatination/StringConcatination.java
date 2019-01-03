package com.OperatorAndAssignments.StringConcatination;

class StringConcatination {
	
	public static void main(String[] args) {
	
	String a = "durga";
	int b = 10;
	int c = 20;
	int d = 30;
	
//	a = b+c+d;
	
	a = a+b+c;

	//	b = a+c+d;
	
	b = b+c+d;

	System.out.println(a+b+c+d);
	System.out.println(b+c+d+a);
	System.out.println(b+c+a+d);
	System.out.println(b+a+c+d);
	}
}