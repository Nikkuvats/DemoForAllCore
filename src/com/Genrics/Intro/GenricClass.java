package com.Genrics.Intro;

public class GenricClass<Type> {

	Type obj;

	GenricClass(Type obj) {
		this.obj = obj;
	}
	
	public void show() {
		
		System.out.println("the type of object : " +obj.getClass().getName());
	}
	
	public Type getObj() {
		
		return obj;
	}
	
	public static void main(String[] args) {
		
		GenricClass<String> objest = new GenricClass<String>("Aayush");
		objest.show();
		
		GenricClass<Integer> obj = new GenricClass<Integer>(109);
		obj.show();
	}
}
