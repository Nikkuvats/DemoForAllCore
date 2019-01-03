package com.Oops.OverloadingAndOverriding;

public class TightCoupled {

	static int i = B.i;

	public static void main(String[] args) {
		System.out.println(i);
	}
}

class B {

	static int i = C.i;
}

class C {

	static int i = D.m1();
}

class D {

	static int m1() {
	return 10;
	}
}