package com.InnerClass.NestedAndAnonymousAndStaticInner;

class Popcon {
	
	public void taste() {
		System.out.println("paste");
	}  
}

public class PopconTest {
	public static void main(String[] args) {
		Popcon p = new Popcon()
		{
			public void taste() {	
			System.out.println("spicy");
			}
		};
		System.out.println(p.getClass().getName());
		p.taste();
		Popcon p2 = new Popcon();
		System.out.println(p2.getClass().getName());
		p2.taste();
		
		Popcon p3 = new Popcon()
		{
			public void taste() {	
			System.out.println("sweets");
			}
		};
		System.out.println(p3.getClass().getName());
		p3.taste();
	}
}

