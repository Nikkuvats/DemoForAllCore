package com.ExceptionHandling.CustomizedException;

 /* Normal Termination  but never took normal code inside try block only risky code should be there*/
 
public class CustomizedExceptionDemo2 {
	
	public static void main(String[] args) {
	show();	
	}
	
	public static void show() {
		
	System.out.println("start");
	try 
	{
	System.out.println(10/0);
	System.out.println("Middle");
	}
	catch(ArithmeticException e){
	System.out.println(10/2);
	}
	System.out.println("end");
	}
}
