package com.ExceptionHandling.CustomizedException;

public class Demo {
	
	public static void main(String[] args) {
	
	 	try {
	 		//Risky code
		}
		catch (ArithmeticException exception) {
			
			//Perform alternative arithmetic operation
		}
		catch (ArrayIndexOutOfBoundsException  exception) {
			
			//Use mySql db instead of oracle db
		}
		catch (Exception exception) {
		
			//Default exception handling
		}
	 	finally {
			
		}
		//Best programming practice
	}
}
