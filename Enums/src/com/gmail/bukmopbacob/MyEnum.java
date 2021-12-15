package com.gmail.bukmopbacob;

enum Colors {
	Red(100), Green(200), Blue(300);
	
	private int num;
	
	private Colors() {
		System.out.printf("Colors ctor for: %s\n", name());
	}
	
	private Colors(int k) {
		System.out.printf("Colors ctor(%d) for: %s\n", k, name());
		this.num = k;
	}
	
	
	public String upperName() {
		return name().toUpperCase();
	}
	
}


public class MyEnum {

	public static void main(String[] args) {
		Colors c1 = Colors.Green;

	}

}
