package com.google.bukmopbacop.graph;

import java.util.ArrayList;
import java.util.List;

public class Shape {
	public static final String DEFAULT_COLOR = "black";
	public static List<Shape> scene = new ArrayList<Shape>();
	public String color;
	
	public static void drawScene() {
		for (Shape shape : scene) {
			shape.draw();
		}
	}
	
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color = color;
		scene.add(this);
	}
	
	public void draw() {
		System.out.printf("Shape. %s\n", this.color);
	}

	
}