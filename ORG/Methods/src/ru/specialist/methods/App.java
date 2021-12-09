package ru.specialist.methods;

import java.util.Collection;
import java.util.List;

public class App {
	
	/*
	 * int gcd(int, int)
	 * 
	 * k1 > k2
	 * k1 % k2 = k3
	 * k2 % k3 = k4
	 * k3 % k4 = k5
	 * 
	 * (1071, 462) == 21
	 * (462, 1071) == 21
	 * 
	 * 
	 */
	
	//static int q;
	
	public static final int DEFAULT_AGE = 18;
	
	// overloading
	static void sayHello() {
		System.out.printf("Привет!\n");
	}
	static void sayHello(int age) {
		System.out.printf("Привет, %d!\n", age);
	}
	static void sayHello(String userName) {
		sayHello(userName, DEFAULT_AGE);
	}
	static void sayHello(String userName, int age) {
		System.out.printf("Привет, %s - %d!\n", userName, age);
	}
	static void sayHello( int age, String userName) {
		System.out.printf("Hello, %s - %d!\n", userName, age);
	}
	
	static int gcd(int k1, int k2) {
		int k3;
		while ( (k3 = k1 % k2) != 0 ) {
			k1 = k2;
			k2 = k3;
		}
		return k2;
	}
	
	static void test1(int a) {
		a++;
		System.out.printf("test 1 a = %d\n", a); // 11
	}
	static void test2(int[] a) {
		a[0]++;
		System.out.printf("test 2 a = %d\n", a[0]); // 11
	}
	static void test3(String a) {
		a += "!";
		System.out.printf("test 3 a = %s\n", a); // Sergey!
	}
	static void test4(StringBuilder a) {
		a.append("!");
		System.out.printf("test 4 a = %s\n", a); // Sergey!
	}
	

	public static void main(String[] args) {
		{
			StringBuilder a = new StringBuilder("Sergey");
			test4( a );
			System.out.printf("main 4 a = %s\n", a); // Sergey!  
		}
		{
			String a = "Sergey";
			test3( a );
			System.out.printf("main 3 a = %s\n", a); // Sergey  
		}
		{
			int[] a = {10};
			test2( a );
			System.out.printf("main 2 a = %d\n", a[0]); // 11 
		}
		{
			int a = 10;
			test1( a );
			System.out.printf("main 1 a = %d\n", a); // 10
		}
		
		
		System.out.println( gcd(1071, 462) );
		System.out.println( gcd(462, 1071) );
		
		
		//App app = new App();
		//app.sayHello();
		//App.sayHello();
		sayHello(11, "Alex");
		sayHello("Сергей", 44);
		sayHello("Костя"/*, 18*/);
		sayHello(18);
		sayHello();
		
//		double x = average(10, 11);
//		System.out.println( x );
		
		System.out.println( average(10, 11) );
		
		System.out.println( average(new int[] {10,11,12,13}) );
		System.out.println( average( 10, 11, 12, 13, 14, 15 ) );
		System.out.println( average( List.of(10,11,12) ) );

	}
	
	static double average( Collection<Integer> m) {
		int summa = 0;
		for(int k : m)
			summa += k;
			
		return (double)summa / m.size();
	}
	
	static double average( int... m /*int[] m*/) {
		int summa = 0;
		for(int k : m)
			summa += k;
			
		return (double)summa / m.length;
		
	}

	static double average(int a, int b) {
//		double avg = (a + b) / 2d;
//		return avg;
		return (a + b) / 2d;
	}
	
}
