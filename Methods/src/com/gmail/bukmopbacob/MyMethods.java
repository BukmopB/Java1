package com.gmail.bukmopbacob;

import java.util.Collection;

public class MyMethods {
	
	public static double average(int a, int b) {
		return (a + b) / 2d;
	}
	
	public void sayHello(String name, int age) {
		System.out.printf("Hello, %s - %d!\n", name, age);
	}

	public static void main(String[] args) {
		MyMethods methods = new MyMethods();
		methods.sayHello("Serg", 45);
		methods.sayHello("Max", 15);
		
		System.out.println(average(10, 11));
		System.out.println(average(new int[] {10,11,12,13}));
		System.out.println(average(10,11,12,13));
//		System.out.println(average(new ListOf<>(10,11,12,13)));
		System.out.println(gcd(1071, 462));
		System.out.println(gcd(462, 1071));

	}
	
//	public static double average(int[] m) {
//		int summa = 0;
//		for (int i : m) {
//			summa += i;
//		}
//		return (double)summa / m.length;
//	}
	public static double average(int... m) {
		int summa = 0;
		for (int i : m) {
			summa += i;
		}
		return (double)summa / m.length;
	}
	
	public static double average(Collection<Integer> m) {
		int summa = 0;
		for (int i : m) {
			summa += i;
		}
		return (double)summa / m.size();
	}
	
	public static int gcd(int k1, int k2) {
		int k3;
		while ( (k3 = k1 % k2) != 0) {
			k1 = k2;
			k2 = k3;
		}
		return k2;
	}

}
