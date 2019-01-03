package com.Oops.ConstructorsandSuperandThis;

class Parent {
	int x = 100;
}

class Child extends Parent {
	
	int x = 1000;	
	
	public void m1() {
		int x = 10;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {
	Child child = new Child();
	child.m1();
	}
}
