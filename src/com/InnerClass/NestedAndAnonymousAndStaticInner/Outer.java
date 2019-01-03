package com.InnerClass.NestedAndAnonymousAndStaticInner;

class Outer {

	int x = 100;
	static int y = 200;

	static class Nested {

		public void m1() {
		System.out.println("static nested class method");
	//	System.out.println(x); can not access without static data membar
		System.out.println(y);
		}
	}

	public static void main(String[] args) {

		Outer.Nested n = new Outer.Nested();
		n.m1();
	}
}
