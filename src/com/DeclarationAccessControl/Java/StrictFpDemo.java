package com.DeclarationAccessControl.Java;

public strictfp class StrictFpDemo {

	static float x = 33/10;
	public static void main(String[] args) {
	
	StrictFpDemo object = new StrictFpDemo();
	object.show();
	}
	
	public strictfp void show(){	
	System.out.println(x);	
	}
}
