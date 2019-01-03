package com.InnerClass.intro;

public class OuterClassDemo {
	
	class InnerClass {
		
		public void innerClassMethod() {
			System.out.println("inner class method");
		}
	}
	
	public static void main(String[] args) {
	
		/*OuterClassDemo object = new OuterClassDemo();        you can combine these two class in single line 
		OuterClassDemo.InnerClass i = object.new InnerClass();
		i.innerClassMethod();*/
		
		/*OuterClassDemo.InnerClass i = new OuterClassDemo().new InnerClass(); all line into single line
		i.innerClassMethod();*/
		
		new OuterClassDemo().new InnerClass().innerClassMethod();
	}
}
