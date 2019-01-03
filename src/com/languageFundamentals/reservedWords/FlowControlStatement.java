package com.languageFundamentals.reservedWords;

class FlowControlStatement {
	static float str;
	private int a = 10;
	public byte b = 13;
	protected short s = 12;
	long  l = 15l;
	float f = 12.5f;
	double d = 115.4;
	boolean check = false;
	char ch = 'a';

	public static void main(String[] args) {
	FlowControlStatement object = new FlowControlStatement();

	System.out.println(str);
	
	System.out.println(object);
	object.forFlowControl();
	object.whileFlowControl();
	object.doWhileFlowControl();
	
	System.out.println(object.a);
	System.out.println(object.b);
	System.out.println(object.s);
	System.out.println(object.l);
	System.out.println(object.f);
	System.out.println(object.d);
	System.out.println(object.check);
	System.out.println(object.ch);
	}
	
	public void forFlowControl() {
	int i = 0;	
	for(i = 0 ; i <= 5 ; i++) {
		if(i % 2 == 0 ) {
			System.out.println("sum numbers : "+i);
		}
		else
		{
		}
	  }
    }
	
    public void whileFlowControl(){
		int i = 0;	
		while(i <= 10) {
			i++;
			System.out.println("while : "+i);
	     }
	}
	
	public void doWhileFlowControl() {
		int i = 0;	
		do {
		System.out.println("do while : "+i);
		i++;
		}
		while(i <= 10);	
	}
}		
		