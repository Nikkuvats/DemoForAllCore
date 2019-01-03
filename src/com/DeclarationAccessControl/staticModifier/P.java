package com.DeclarationAccessControl.staticModifier;

public class P {
	
	public static void main(String[] args) {
	System.out.println("Parent");	
	}
}

class C extends P
{
	public static void main(String[] args) {
	System.out.println("Child");	
	}
}
