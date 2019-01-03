package com.DeclarationAccessControl.Synchronized;

interface Left {
	int x  =10;
	public void m1();	
}

interface Right {
	int x = 20;
	public void m1(); 
}

public class Check implements Left ,Right {

	static int y = 30;
	
	@Override
	public void m1() {
	
	}
	
	public static void main(String[] args) {
	System.out.println(Left.x);	
	System.out.println(Right.x);
	System.out.println(y);
	}
}
