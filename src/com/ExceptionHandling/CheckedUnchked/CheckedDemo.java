package com.ExceptionHandling.CheckedUnchked;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	PrintWriter pWriter = new PrintWriter("abc.text");
	pWriter.print("hello");	
	System.out.println("hello Aayush");
	//System.out.println(10/0);
	}
}
