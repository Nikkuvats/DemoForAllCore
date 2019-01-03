package com.DeclarationAccessControl.Synchronized;

import java.io.Serializable;

import org.omg.PortableServer.THREAD_POLICY_ID;

interface CheckCombination extends Serializable {
	
}

interface checks extends Serializable,CheckCombination {
static int x = 10;	 
public int y = 10;
public static int z = 10;
public final static int $ = 10;
public final int _ = 10;

}

class checking extends Thread implements Serializable,checks {
    //x = 10; 
	public static void main(String[] args) {
	int x = 14;
	}
}

class x extends checking implements CheckCombination {
	
}