package com.ExceptionHandling.Throw;

class TooYoungException extends RuntimeException {

	TooYoungException(String s){
		super(s);
	}
}

class TooOldException extends RuntimeException {
	
	TooOldException(String s){
		super(s);
	}
}

public class CustException 
{
	public static void main(String[] args) {
		
		int age = Integer.parseInt(args[0]);
		if(age > 60) {
		 throw new TooYoungException("Please wait some more time , you will get best match soon");	
		}
		
		else if (age < 16) {
		 throw new TooOldException("Your age already crossed marrige age.. no change of getting marrige");	
		}
	}
}