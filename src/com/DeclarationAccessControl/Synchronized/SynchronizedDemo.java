package com.DeclarationAccessControl.Synchronized;

class Demo 
{
	public native void m1();
	
	static {
		System.loadLibrary("native liberary load");
	}
	
	synchronized static void show() {
		
	}	
}

class SynchronizedDemo {
	
	public static void main(String[] args) {
	
	}
}