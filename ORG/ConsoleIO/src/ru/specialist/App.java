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
		
		System.out.print("���: ");
		String userName = reader.readLine();
		
		System.out.print("�������: ");
		int age = Integer.parseInt(reader.readLine());*/
		//Double.parseDouble( s )
		Scanner sc = new Scanner( System.in );
		System.out.print("���: ");
		String userName = sc.nextLine();
		
		System.out.print("�������: ");
		int age = sc.nextInt();
		// sc.nextDouble()
		// f = c * 9 / 5 +32
		
		// ������, ������ - 44!
		
		System.out.printf("������, %s - %d!\n", userName, age);
		String s = String.format("������, %-10s - %d!", userName, age);
		System.out.println( s );
		// pi = 3.1415
		System.out.printf("pi = %10.4f\n", Math.PI);
		
	}

}
