package com.ExceptionHandling.IntroAndMultiCatchBlock;

public class ExceptionDemo {
	
	public static void main(String[] args) {
	
		try {
			// Read data from remote file locating at london 		
		}
		catch (Exception e) {
			// Use local file & continue rest of the program normally
		}
	}
}
/*
 * All possible compile time errors
 * 1.	Exception xxx has already been caught
 * 2.	Exception xxx is never thrown in body of corresponding try statement
 * 3.   Unreachable statement 
 * 4.	incomatiable types
 * 		found : test
 * 		required: java.lang.throwable
 * 5.	try without catch or finally 
 * 6.	catch without try
 * 7.	finally without try
 *
 */
