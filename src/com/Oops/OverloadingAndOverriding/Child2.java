package com.Oops.OverloadingAndOverriding;

class Child2 {

	public void m1(Object o) {
		
		System.out.println("Object");
	}

	public void m1(String str) {

		System.out.println("String");
	}

	public void m1(StringBuffer str) {

		System.out.println("StringBuffer");
	}
	
	public static void main(String[] args) {

		Child2 ch = new Child2();
	    ch.m1("hello india");
	    ch.m1(new StringBuffer("Hello Aayush"));
	//  ch.m1(null); CE : error
	}
}
