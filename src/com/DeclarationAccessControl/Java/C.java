package com.DeclarationAccessControl.Java;
import com.DeclarationAccessControl.Package.A;

public class C extends A {
	
	public static void main(String[] args) {
	
//	A a = new C();
//	a.m1();
		
//	A b1 = new C();
//	b1.m1();
		
	C c = new C();
	c.m1();
	}
}

class D extends C
{
	public static void main(String[] args) {
	
//	C a = new D();
//	a.m1();
		
//	C b1 = new D();
//	b1.m1();
		
	D c = new D();
	c.m1();

	}
}
