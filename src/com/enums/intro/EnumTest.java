package com.enums.intro;

enum Beers {

	KF, KO, RC, FO
}

public class EnumTest {
	public static void main(String[] args) {
		
		Beer[] b = Beer.values(); // values() we can not see this in java api anymore because enum provide it implicit
		
		for (int i = 0; i < b.length; i++) {
		
			System.out.println(b[i]);
		}
	}
}
