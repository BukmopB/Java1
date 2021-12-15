package ru.specialist;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Locale.setDefault( Locale.US );
		Locale.setDefault( Locale.forLanguageTag("ru") );
		
		ResourceBundle labels = ResourceBundle.getBundle("ru.specialist.text", Locale.getDefault());
		String temp = labels.getString("SymbT");
		System.out.println(temp);
		
		// ���� ������
		Scanner sc = new Scanner( System.in );
		System.out.print("T (C): ");
		double tc = sc.nextDouble(); // ,
		
		// ��������� ������
		double tf = tc * 9 / 5 + 32;
		
		// ����� ������
		System.out.printf(  Locale.US, "T (F): %.4f\n", tf); // .
		
		
		
		

	}

}
