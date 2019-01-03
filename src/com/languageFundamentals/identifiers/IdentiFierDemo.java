package com.languageFundamentals.identifiers;

class IdentiFierDemo implements Runnable {
	
	@Override
	public void run() {
	
		int run = 14;
	}
	
	int run = -114;
	int Int = 14;
    static int List = 10;
    static int Set = 11;
    static int Map = 12;// case senstive language  
    static int mapmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm = 13;
    
    
    // static int void = 10;
    // int if = 10; can not use as identifier
    
    static String x4 = "Aayush";
    static String x5 = "Kumar";
    static String x6 = "vats";
    static String x7 = "Noida";
    static String x8 = "Uttar pradesh";
    static String x9 = "Austerlia";
    static int xa = 15;
    int _d = 10;
    int $1 = 13;
    int $2 = 14;
    int $_ = 15; 
    int _$ = 10;
    int _1 = 12;
    int _a = 13;
    int _b = 15;
	public static void main(String[] args) {
	System.out.println(List);	
	System.out.println(Set);
	System.out.println(Map);
	System.out.println(x4);
	System.out.println(x5);
	System.out.println(x6);
	System.out.println(x7);
	System.out.println(x8);
	System.out.println(x9);
	System.out.println(xa);	
	IdentiFierDemo demo = new IdentiFierDemo();
	System.out.println(demo.$1);
	System.out.println(demo.$2);
	System.out.println(demo.$_);
	System.out.println(demo._$);
	System.out.println(demo._1);
	System.out.println(demo._a);
	System.out.println(demo._b);
	}
}
