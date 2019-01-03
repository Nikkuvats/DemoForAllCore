package com.DeclarationAccessControl.Java;

 abstract strictfp class ParentAbstractMethod {
 
	/* If Any modifiers talks about implementation then it is enemy of abstract method.
	 * If we declare any abstract method with, private, native, final, synchronized,
	 * static, private, and strictfp then it will give compile time error 'illegal combination of modifiers'.
	 */
	
    abstract public int getNoOfWheels();
	abstract protected int getAllWheels();
	
	public final void show() {
	System.out.println("normal method");	
	}
	
}

class chieldAbstract extends ParentAbstractMethod {

	@Override
	public int getNoOfWheels() {
		
	return 8;
	}
	
	@Override
	protected int getAllWheels() {
	
	return 10;
	}
	
	public static void main(String[] args) {
	chieldAbstract object = new chieldAbstract();
    object.show();
	System.out.println(object.getNoOfWheels());
	}
} 
