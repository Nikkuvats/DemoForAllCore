package com.InnerClass.intro;


 class OuterClassDemo3 {

	 int x =10;
	 static int y = 20;
	 class InnerClassDemo2 {
        int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println("inner class method");
			System.out.println(x);
			System.out.println(InnerClassDemo2.this.x);
			System.out.println(OuterClassDemo3.this.x);
			System.out.println(y);
		}
	}
}

class Test {

	public static void main(String[] args) {

		OuterClassDemo3 obj = new OuterClassDemo3();
		OuterClassDemo3.InnerClassDemo2 i= obj.new InnerClassDemo2();
		i.m1();
	}
}
