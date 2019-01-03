package com.Oops.OverloadingAndOverriding;

public class TypeCasting {
	
	public static void main(String[] args) {
	
		Object obj = new String();
		StringBuffer stBuffer = (StringBuffer)obj;
		
		String s = new String();
		Object o = (Object)s;
		
		
	}
}
