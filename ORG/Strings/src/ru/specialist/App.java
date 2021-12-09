package ru.specialist;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String s1 = new String("abc"); // 1
		String s2 = new String("abc"); // 2
		String s3 = "cde"; // 3
		String s4 = "cde"; // 3
		
		String s5 = "c\"de\n\t\\\u002F";
		
		String hello = "Привет";
		String name = "Сергей";
		String r = hello + " " + name + "!";
		String r2 = "Привет Сергей!";
		/* "Привет"
		 * "Привет "
		 * "Привет Сергей"
		 * "Привет Сергей!"
		 */
		
		
		System.out.println(r);
		System.out.println(r.length());
		System.out.println(r.charAt(0));
		System.out.println(r.charAt(r.length() - 1));
		
		System.out.println(r.contains("Сергей") );
		System.out.println(r.indexOf("Сергей") );
		System.out.println( r.trim() );
		System.out.println( r.substring(7, 13) );
		System.out.println( r.replace("Сергей", "Андрей") );
		System.out.println( r.toUpperCase() );
		System.out.println( r.toLowerCase() );
		
		String t1 = new String("Hello");//new Scanner( System.in).nextLine();
		String t2 = "Hello";
		
		
		System.out.println( t1 == t2); // by ref
		System.out.println( t1.equals(t2) ); // by value
		
		// StringBuffer
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		String result = sb.toString();
		
		//result.split(r)
		
		// 1 2 3 4 .. 100
		// VERY BAD (fired!!)
//		String result = "";
//		for(int i=1; i <= 100; i++)
//			result += String.valueOf(i)+ " ";
		
		/* ""
		 * "1"
		 * "1 "
		 * "1 2"
		 * "1 2 "
		 * 
		 * 
		 */
		
		System.out.println(result);
		
		
		
		
		
	}

}
