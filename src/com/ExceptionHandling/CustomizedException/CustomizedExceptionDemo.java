package com.ExceptionHandling.CustomizedException;

/*Abnormal termination 
Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.ExceptionHandling.CustomizedException.CustomizedExceptionDemo.main(CustomizedExceptionDemo.java:10)
*/

public class CustomizedExceptionDemo {
	
	public static void main(String[] args) {
	
		System.out.println("hello");
		try 
		{
		System.out.println(10/0);
		}
		finally {
		System.out.println("India");	
		}
	}
}
