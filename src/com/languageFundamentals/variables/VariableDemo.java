package com.languageFundamentals.variables;

class VariableDemo {
    //instance variable
	int x;
	
	public VariableDemo(int x) {
	this.x=x;  
	}
	
	public static void main(String[] args) {
	
	// Value of x varied from object to object
		
	VariableDemo obj = new VariableDemo(10);
	VariableDemo obj2 = new VariableDemo(20);  

	obj.show();
	
	System.out.println(obj.x);
	System.out.println(obj2.x);
	}
	
	public void show() {
	//local variable
	int y = 100;
	System.out.println(y);
	}
}