package com.google.bukmopbacop.stuff;

public class Person {
	public String name;
	public int age;
	
	public void show() {
		String nameString = "Unknown";
		System.out.printf("%s - %d\n", this.name, age /*this.age*/);
	}
}
