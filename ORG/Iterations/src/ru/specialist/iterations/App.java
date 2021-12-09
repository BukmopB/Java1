package ru.specialist.iterations;

public class App {

	public static void main(String[] args) {
		int lower = 1;
		int upper = 10;
		
		for(int i=lower; i <= upper; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println( i );
		}
		
		
		//for (int i=100; i >= 0; i -= 3)
		//	System.out.println( i );
		
		// 1 2 3 .. 10
		// 2 4 6 .. 20
	metka:
		for(int i=1; i <= 10; i++) {
			for(int j=1; j <= 10; j++) {
				
				//if (j == 5) goto metka; // c, c++, c#
				if (j == 5) break metka; 
				
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		
		System.out.println("\ncontinue");
		
		int a = 2000;
		while ( a < 1000 ) {
			System.out.println(a);
			a *= 2; // a = a * 2;
		}
		
		a = 2;
		do {
			System.out.println(a);
			// a *= 2; // a = a * 2;
		} while( (a *= 2) < 1000);
		
		// 1 1 2 3 5 8 13 21
		
		int k1;
		int k2 = k1 = 1;
		
		System.out.println(k1);
		System.out.println(k2);
		
		int k3;
		
		while ( (k3 = k1 + k2) < 1000 ) {
			System.out.println(k3);
			k1 = k2;
			k2 = k3;
		}
		
		
		
		
		
		
		
		

	}

}
