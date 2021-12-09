package ru.specialist.stuff;

/*
 * Point
 * 	x,y
 * 
 * Point()
 * Point(x,y)
 * 
 * draw()
 * 
 * static ArrayList<Point> points
 * 
 * static drawPoints()
 * 
 * 
 * new Point()
 * new Point(12, 2)
 * 
 */

public class Person {
	public String name = "Незнакомец"; // init expression
	public int age;
	
	// init block
	{
		this.age = 18;
	}
	
	static int counter = 0;
	static {
		counter = 0;
	}
	
	public static void showCounter() {
		System.out.println(Person.counter);
	}
	
	public Person() {
		this("Unknown");
		//System.out.println();
	}
	public Person(String name) {
		this(name, 18);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
		//Person.counter++;
		counter++;
	}
	
	public void show() {
		String name = "Unknown";
		System.out.printf("%s - %d\n", this.name, age /*this.age*/);
	}

}
