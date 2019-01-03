package com.languageFundamentals.reservedWords;

public class ContinueStatement {
	
	public static void main(String[] args) {
	ContinueStatement object = new ContinueStatement();	
	object.continoue();	
	}
	
	public void continoue() {
		
	int [] numbers = {10,20,30,40,50};
	for (int i : numbers) {
		if(i == 30) {
            continue;
         }
        System.out.print(i);
        System.out.print("\n");
	  } 
	}
}
