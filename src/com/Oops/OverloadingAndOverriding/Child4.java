package com.Oops.OverloadingAndOverriding;

import java.io.IOException;

abstract class Parent {
	 
	 public Object m1() throws IOException {

	 System.out.println("Object");
	 return null; 
	 }
	 
	 public abstract void show();
		 
 }
 
 class Child4 extends Parent {

	 public String m1() throws NullPointerException {
	
	 System.out.println("String");
	 return null;	 
	 }
	 
	 public static void main(String[] args) {
		
	 Parent obj = new Child4();
  // obj.m1();
	}

	@Override
	public void show() {
		
	}
 }
