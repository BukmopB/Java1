package ru.specialist.voroy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.print("������� ����� �� �����? ");
		int n = new Scanner(System.in).nextInt();
		
		String v;
		int n2 = n % 100;
		if ( n2 >= 11 && n2 <= 14)
			v = "�����";
		else
			v = switch(n % 10) {
				case 1 -> "������";
				case 2,3,4 -> "������";
				default -> "�����";
			};
		
		System.out.printf("�� ����� %d %s\n", n, v);
		
		
	}

}
