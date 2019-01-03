package com.OperatorAndAssignment.instanceOf;

class InstanceOfDemo extends Thread{
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		System.out.println(t instanceof InstanceOfDemo);
		System.out.println(null instanceof Thread);
	}
}