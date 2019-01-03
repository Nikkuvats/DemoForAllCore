package com.ExceptionHandling.Throw;

public class ThrowDemo {
	
	static ArithmeticException exception = new ArithmeticException("/ by zero");
	public static void main(String[] args) {
	
		throw exception;
	}
}
