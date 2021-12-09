package ru.specialist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
		
		while(true) {
			System.out.print("Èìÿ: ");
			String name = sc.nextLine();
			if (name.isBlank()) break;
			else names.add(name);
		}
		
		Collections.sort(names);
		
		for(String n : names)
			System.out.println(n);
		
		
		

	}

}
