package ru.specialist;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Locale.setDefault( Locale.US );
		Locale.setDefault( Locale.forLanguageTag("ru") );
		
		// ÂÂÎÄ ÄÀÍÍÛÕ
		Scanner sc = new Scanner( System.in );
		System.out.print("T (C): ");
		double tc = sc.nextDouble(); // ,
		
		// ÎÁĞÀÁÎÒÊÀ ÄÀÍÍÛÕ
		double tf = tc * 9 / 5 + 32;
		
		// ÂÛÂÎÄ ÄÀÍÍÛÕ
		System.out.printf(  Locale.US, "T (F): %.4f\n", tf); // .
		
		
		
		

	}

}
