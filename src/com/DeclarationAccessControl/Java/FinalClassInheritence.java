package com.DeclarationAccessControl.Java;

 final class FinalClassInheritence {

	final static int x = 10; 
	public void FinalMethod() {
		System.out.println("Parent implementation");
	}
	
	public void method() {
		System.out.println("Parent implementation");	
	}
	
	public static void main(String[] args) {
    int x = 7777;
	System.out.println(FinalClassInheritence.x);
	}
}
 
