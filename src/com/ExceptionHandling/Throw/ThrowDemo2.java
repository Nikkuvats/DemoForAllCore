package com.ExceptionHandling.Throw;

public class ThrowDemo2 extends RuntimeException {

	public static void main(String[] args) {
		
		throw new ThrowDemo2();
	//	System.out.println("hello"); unreachable code
	}
}
