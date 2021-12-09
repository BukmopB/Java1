package ru.specialist.oop;

import ru.specialist.graph.*;
import ru.specialist.stuff.Person;

public class App {

	public static void main(String[] args) {
		{
			Person.showCounter();
			
			Person p = new Person("Сергей", 40);
	//		p.name = "Сергей";
	//		p.age = 40;
			
			Person p2 = new Person("Костя");
	//		p2.name = "Костя";
	//		p2.age = 15;
			
			Person px = new Person();
			
			p.show(); // this == p 
			p2.show();// this == p2
			px.show();
			
			Person.showCounter();
		}
		{
			Point p1 = new Point();
			Point p2 = new Point(10, 20, "GREEN");
			
			p1.draw();
			p2.draw();
			
			
		}

	}

}
