package com.DeclarationAccessControl.Java;

class Parent {
	
	public static void FinalMethod() {
		System.out.println("Parent implementation");
	}
	
	public final void method() {
		System.out.println("Parent implementation");	
	}
}

class Chield extends Parent {
	
	public static void FinalMethod() {
		System.out.println("child implementation");
	}
	
	public final void method2() {
		System.out.println("child implementation");
	}
	
	public static void main(String[] args) {
	
	Parent object = new Chield();
	object.FinalMethod();
	}
}
