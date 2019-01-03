package com.InnerClass.intro;

public class OuterClassDemo2 {

	class InnerClassDemo {

		public void m1() {
			System.out.println("inner class method");
		}
	}

	public void m2() {

		InnerClassDemo obj = new InnerClassDemo();
		obj.m1();
	}

	public static void main(String[] args) {

		OuterClassDemo2 obj = new OuterClassDemo2();
		obj.m2();
	}
}
