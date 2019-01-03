package com.DeclarationAccessControl.staticModifier;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 object = new Test2();
		object.main(new int[4]);
		System.out.println("hello");
	}
	
	public static void main(int[] arg) {
		System.out.println("aayush");
	}
}
