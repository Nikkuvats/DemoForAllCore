package com.Oops.IsaAndHasaRelationShip;

class Parent {
	
	public void show(){
		
		System.out.println("parent");
	}
	
	public void display() {
		
		System.out.println("parent");
	}
}

class Child extends Parent {
	
	public void childShow() {
		
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.show();
		p.display();
	
	//	p.childShow(); CE: Can not find symbol method()
		
		Child  c= new Child();
		c.childShow();
		c.display();
		c.show();
		
		Parent pc= new Child();
	
	//	pc.childShow(); CE: Can not call method parent in child when create instance use of Parent reference
		
		pc.display();
		pc.show();
		
	//	Child cp = new Parent(); CE : incompatible type / can not create parent instance with use of child reference
	}
}
