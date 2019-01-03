package com.DeclarationAccessControl.Package;

public class  A
	{	
	protected void m1 () 
	{
	System.out.println("the most miss understood modifier");	
	}
}

 class B extends A 
	{
	public static void main(String[] args) 
	{
	A a = new A();
	a.m1();
	
	B b = new B();
	b.m1();
	
	A b2 = new B();
	b2.m1();
	}
}