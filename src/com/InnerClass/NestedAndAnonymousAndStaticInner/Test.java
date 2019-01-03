package com.InnerClass.NestedAndAnonymousAndStaticInner;

import com.InnerClass.NestedAndAnonymousAndStaticInner.ClassA.ClassB;

class ClassA {
	
	class ClassB {
		
		class ClassC {
			
			public void m1 () {
				
				System.out.println("InnerMost class Method");
			}
		}
	}
}

public class Test {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassA.ClassB b = a.new ClassB();
		ClassB.ClassC c = b.new ClassC();
		c.m1();
	}
}
