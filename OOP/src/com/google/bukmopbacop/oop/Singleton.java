package com.google.bukmopbacop.oop;

public class Singleton {

	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	private static Singleton instanceSingleton = null;
	
	public static Singleton getSingleton() {
		if (instanceSingleton == null) 
			instanceSingleton = new Singleton();
		return instanceSingleton;
	}

}
