package com.Oops.OverloadingAndOverriding;

class Child3 {
	
	public void m1(int i, double d) {
		
		System.out.println("Object");
	}

	public void m1(float f, int i) {

		System.out.println("String");
	}

	public void m1(StringBuffer str) {

		System.out.println("StringBuffer");
	}
	
	public static void main(String[] args) {

		Child3 ch = new Child3();
		ch.m1(100f , 10);
	}
}
