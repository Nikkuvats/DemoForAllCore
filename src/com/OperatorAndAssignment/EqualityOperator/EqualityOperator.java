package com.OperatorAndAssignment.EqualityOperator;

class EqualityOperator {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1 ; 
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		
		
		Thread t = new Thread();
		Object o = new Object();
		String s = new String("durga");
		System.out.println(t == o);
		System.out.println(o == s);
	//	System.out.println(s == t); ce :  incomparable type
	}
}