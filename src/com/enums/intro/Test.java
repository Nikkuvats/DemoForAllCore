package com.enums.intro;

 enum Beer {
	
	KF, RC, KO, FO                  // public static final Beer KF = new Beer()
}

class Test {
	
	public void show () {
		
	 //	KF,RC can not define enum inside method
	}
	
	private strictfp static enum Bike 
	{
		HONDA, HERO, YAMAHA 
	}
	
	public static void main(String[] args) {
		
		Beer b = Beer.KF;
		System.out.println(b); // internally toString method implementing to return the name of constant 
		
		switch(b) {
		
		case KF:
			System.out.println("its children brand");
			break;

		case KO:
			System.out.println("its also children brand");
			break;
		
		case RC:
			System.out.println("its youngers brand");
			break;
			
		case FO:
			System.out.println("its also yourgers brand");
			break;
		
	        default:
			System.out.println("its for all ");
			break;
		}	
	}
}