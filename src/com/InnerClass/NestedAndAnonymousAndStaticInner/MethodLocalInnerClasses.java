package com.InnerClass.NestedAndAnonymousAndStaticInner;

public class MethodLocalInnerClasses {

	int a = 10;
	static int b = 20;
	
	public void m1() {
		
	    int c = 30;
		class Inner {
			public void sum(int x, int y) {
				
				System.out.println(x+y);
				System.out.println(y+y);
				
//				System.out.println(a); when method is static then can not access non access member of outer class 
				System.out.println(b);
				System.out.println(c);
			}
		}
		Inner obj = new Inner();
		obj.sum(10, 200);
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClasses classes = new MethodLocalInnerClasses();
		classes.m1();
	}
}
