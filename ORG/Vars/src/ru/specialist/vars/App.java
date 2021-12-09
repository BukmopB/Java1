package ru.specialist.vars;

import java.util.Scanner;


class Áîðù {
	
}

public class App {
	
	public static final double PI = 3.1415;
	
	public static final String DEFAULT_COLOR = "BLACK";
	
	public static final int DIMENSIONS = 3;
	
	
	public int q; // object field
	
	public static int a;
	static boolean d = false;
	
	public static void main(String[] args) {
		{ // value type
			int a = 10;
			int b = a;
			a++;
			System.out.printf("a = %d\nb = %d\n", a, b); // 11 10
		}
		{ // ref type
			int[] a = {10};
			int[] b = a; //a.clone();
			a[0]++;
			System.out.printf("a = %d\nb = %d\n", a[0], b[0]); // 11 11
		}
		char c5 = 'a' + 'b';
		
		System.out.println(c5);
		
		var ch = 'A'; // char ch = 'A'
		
		//Áîðù áîðù = new Áîðù();
		var áîðù = new Áîðù();
		
		
		//App app = new App();
		var app = new App();
		
		var s = "abc"; // String s = "abc"
		//var i = 5; // int i = 5;
		
		System.out.println( App.DEFAULT_COLOR );
		String s1 = "a" + "b"; // ab
		
		

		
		// local vars scope
		int counter = 5 / (1+1); // 2
		
		double f = 5d / 2; // 2.0
		// Math.PI
		String userName = "Sergey";
		
		int x, y;
		x = 2 * counter;
		
		
		{
			int a = 10;
			//a = a * 2;
			//a *= 2;
			//a = a + 1;
			//a += 1;
			int b = ++a; // a == 11, b == 11
			
			int c = 10;
			int d = c++; // c == 11, d == 10
			System.out.println( a ); // 11 
			System.out.println( b ); // 11
			System.out.println( c ); // 11 
			System.out.println( d ); // 10
		}
		
		{
			String b = "abc";
			System.out.println( b );
		}
		
		for(int i=1; i <=10; i++) {
			System.out.println(i);
		}
		// System.out.println( i ); // out of scope
			
				
		System.out.println( counter );
		System.out.println( x );
		
		{
			int a = 5;
			a = 0x1F; // 31
			a = 040;  //32
			long l = 1L;
			long b = Integer.MAX_VALUE + 1L;
			
			b = a; // implicit conv
			a = (int)l; // explicit conv
			
			double d = 2.5;
			d = 3e8;
			float f2 = 1.5F;
			
			char c = 'a';
			char c2 = '\n';
			char c3 = '\\';
			char c4 = '\u002F';
			
			System.out.println(b);
		}
		{
			boolean a = true;
			boolean b = false;
			
			// ËÎÃÈ×ÅÑÊÎÅ È
			boolean c = a && b; // false
			
			// ËÎÃÈ×ÅÑÊÎÅ ÈËÈ
			c = a || b; // true
			
			// ËÎÃÈ×ÅÑÊÎÅ ÍÅ
			c = !a; // false
			
			c = a && !b; // true
			
			c = a || !b; // shorten exec
			
			//c = a | !b; // full exec
			
			System.out.println( c );
			System.out.println( d );
			
			System.out.println( Math.PI );
			final int n = new Scanner(System.in).nextInt(); // final vars
			final int p = 5; 
			final int z = p + 5;  
			
			System.out.println( (n >= 0) && (n <= 100) );
			
		}



	}

}
