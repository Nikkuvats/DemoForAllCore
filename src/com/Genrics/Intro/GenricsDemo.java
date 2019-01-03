package com.Genrics.Intro;

import java.util.ArrayList;

public class GenricsDemo {
	
	public static void main(String[] args) {
	
		ArrayList<String> alList = new ArrayList<String>();
		alList.add("Aayush");
		alList.add("Nikku");
	
		//	alList.add(new Integer(10));
		
		alList.add("Devesh");
		System.out.println(alList);
	}
}
