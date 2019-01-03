package com.Oops.ControlFlow;

public class BothControlFlow {
	
	{
	System.out.println("FIB");// 2	
	}
	
	static {
	
		System.out.println("FSB");// 1
	}
	
	BothControlFlow(){
		
		System.out.println("constructor");// 4
	}
	
	public static void main(String[] args) {
		
		BothControlFlow object = new BothControlFlow();
		System.out.println("SSB"); // 5
	}
	{
		System.out.println("SIB");// 3
	} 
}
