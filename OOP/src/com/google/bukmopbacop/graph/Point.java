package com.google.bukmopbacop.graph;

import java.util.ArrayList;
import java.util.List;

public class Point extends Shape {
	private int x;
	private int y;
	private static List<Point> points = new ArrayList<Point>();
	
	public static void drawPoints() {
		for (Point point : points) {
			point.draw();
		}
	}

	public Point() {
		this(0, 0, "black");
	}
	
	public Point(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
		points.add(this); // BAD
	}

	
	public void draw() {
		System.out.printf("This is a %s point with coords (%d, %d)\n",this.color, this.x, this.y);
	}
	
	
}
