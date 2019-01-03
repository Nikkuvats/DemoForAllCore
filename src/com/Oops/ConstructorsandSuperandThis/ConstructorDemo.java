package com.Oops.ConstructorsandSuperandThis;

public class ConstructorDemo {
	
	static int count = 0;
	
	{
	count++;	
	}
	
	// overloaded constructor
	
	ConstructorDemo(){
	
	}

	ConstructorDemo(int i){
	
	}
	
	ConstructorDemo(double d){
	
	}
	
	public static void main(String[] args) {
	
	ConstructorDemo demo = new ConstructorDemo();
	ConstructorDemo demo2 = new ConstructorDemo(10);
	ConstructorDemo demo3 = new ConstructorDemo(10.5);
	System.out.println("total number of object "+ count);
	}
}
