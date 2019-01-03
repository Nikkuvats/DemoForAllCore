package com.Oops.ControlFlow;

public class InstanceBase {
		
	int i =10;
	
	{
		m1();
		System.out.println("first Instance block");
	}
	
	InstanceBase() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		InstanceBase obj = new InstanceBase();
		System.out.println("main");
	}
	private void m1() {
		System.out.println(j);
	}
	{
		System.out.println("second instance block");	
	}
	int j =20;
}
