package ru.specialist.operators;

public class App {
	
	public static void main(String[] args) {
		int n = -10;
		
		if (n > 0) {
			System.out.println("n > 0");
			System.out.println("n больше 0");
		}
		else { 
			if (n > -100)
				System.out.println("n > -100");
			else
				System.out.println("n НЕ больше 0");
		}
		
		int a = 0;
//		String s;
//		if (a == 0)
//			s = "ноль";
//		else
//			s = "не ноль";
		
		String s = (a == 0) ? "ноль" : "не ноль";
		String name = "Sergey";
		
//		if (name != null)
//			System.out.println( name.toUpperCase() );
//		else
//			System.out.println( "<no name>" );
		
		System.out.println( (name != null) ? name.toUpperCase() : "<no name>" ); // SERGEY	
		System.out.println( name ); // Sergey
		
		int x = -1;
		
//		switch (x) {
//			case -1, 1 :
//				System.out.println("один");
//				break;
//			case 2 :
//				System.out.println("два");
//				break;
//			case 3 :
//				System.out.println("три");
//				break;
//			default:
//				System.out.println("много");
//		}
		
		
		// switch express (since Java 12)
		String r = switch (x) {
			case -1, 1 -> "один";
			case 2 -> "два";
			case 3 -> "три";
			default -> "много";
		};
		
		System.out.println(r);
		
		// Сколько ворон на ветке (0..9)?
		// На ветке 5 ворон
		
		
		
		

	}

}
