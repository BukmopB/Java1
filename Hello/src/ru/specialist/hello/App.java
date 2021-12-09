package ru.specialist.hello;

import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Calendar;

// ru.specialict.hello.App - полностью квалифицированное имя класса
/**
 * 
 * @author bukmop
 * @param args command line parameters
 *
 */
public class App {
	public int q; // object field -- lifetime 2 живут вместе с объектом
	
	public static int a; // scope --- поля класса    // возникают в момент загрузки -- lifetime 3 не уничтожаются до окончания программы

	public static void main(String[] args) {
		// local vars scope
		int counter = 5 / (1 + 1);  // stack lifetime 1 -- min
		
		Test2 t;
		
//		java.util.Date d;
		Date d;
		Date d2;
		Calendar c;
		BufferedReader r;
		
		
		
		{ // блочный оператор --- минимальный scoup 1 ---> область видимости
			int a, b;
			a = b = 10; // ==> a = (b = 10)
			
			double x = 5 / 2;
			double y = 5d / 2;
			
			System.out.println("Hello ugly world!");
			System.out.println(x);
		}
		
		{
			String b = "abc";
			System.out.println(b);
		}
		
		for (int i = 0; i < 10; i++) {
			// scoup 2---> область видимости
			
		}
		
//		System.out.println(y);
		System.out.println(a);
//		System.out.println(b);
		
		int b = 5;
		b = 0x1F; // 31
		b = 040; // 32
		long l = 1L;
		long k = Integer.MAX_VALUE +1; // переполнение
		long k2 = Integer.MAX_VALUE +1L; // а так нет 
		
		
		double d3 = 2.5;
		d3 = 3e8;
//		float f = 1.5;
		float f2 = 1.5f;
		
		char c1 = 'a';
		char c2 = '\n';
		char c3 = '\\';
		char c4 = '\u002F';
		
		
		{
			boolean a = true;
			boolean b1 = false;
			
			boolean c5 = a || !b1; // !b1 выполняться не будет
		}
		
		
		final int n = -10;
//		n = 1; // нельзя изменить, но это не константа
		
		final int n2 = new Scanner(System.in).nextInt(); // final vars
//		n2 = 7; // нельзя изменить, но это не константа
		final int n3 = 6; // constant but
		int n4 = 6;
		final int n5 = 6 + n4; // final vars
		
		System.out.println();
		
	
	}

}
