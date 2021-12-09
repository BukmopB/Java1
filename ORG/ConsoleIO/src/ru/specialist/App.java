package ru.specialist;

//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) //throws IOException 
	{
		
		/*var reader =
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Имя: ");
		String userName = reader.readLine();
		
		System.out.print("Возраст: ");
		int age = Integer.parseInt(reader.readLine());*/
		//Double.parseDouble( s )
		Scanner sc = new Scanner( System.in );
		System.out.print("Имя: ");
		String userName = sc.nextLine();
		
		System.out.print("Возраст: ");
		int age = sc.nextInt();
		// sc.nextDouble()
		// f = c * 9 / 5 +32
		
		// Привет, Сергей - 44!
		
		System.out.printf("Привет, %s - %d!\n", userName, age);
		String s = String.format("Привет, %-10s - %d!", userName, age);
		System.out.println( s );
		// pi = 3.1415
		System.out.printf("pi = %10.4f\n", Math.PI);
		
	}

}
