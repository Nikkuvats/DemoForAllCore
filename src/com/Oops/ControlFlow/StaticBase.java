package com.Oops.ControlFlow;

class StaticBase {
	
	static int i = 10; // 1
	static // 2
	{
		m1(); 
		System.out.println(i);
		System.out.println("Base static base"); 
	}
	
	public static void main(String[] args) { // 3	
		m1();
		System.out.println("main");
	}
	
	public static void m1() {
		System.out.println(j);
	}	
	static int j = 20;
}


