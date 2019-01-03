package com.Collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
	// 	HashMap map = new HashMap();
		WeakHashMap weakHashMap = new WeakHashMap();
		Temp t = new Temp();
		weakHashMap.put(t, "durga");
		System.out.println(weakHashMap);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakHashMap);
	}
}

class Temp {
	public String toString() {
	return "temp";
	}
	
	public void finalize() {	
		System.out.println("Finalize method");
	}
}
