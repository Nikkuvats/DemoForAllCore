package com.Oops.OverloadingAndOverriding;

class Child {

	public void m1() {
		
		System.out.println("no arg");
	}

	public void m1(long i) {

		System.out.println("arg");
	}

	public static void main(String[] args) {

		Child ch = new Child();
	 // ch.m1();
		ch.m1('a');
		ch.m1(10);
	}
}
