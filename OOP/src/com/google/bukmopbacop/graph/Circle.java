package com.google.bukmopbacop.graph;

public class Circle extends Shape{
	private int x;
	private int y;
	private double r;
	
	public Circle() {
		this(1, 1, 1.5, "black");
	}
	
	public Circle(int x, int y, double r, String color) {
		super(color); // если не вызвать, то будет вызван дефолтный конструктор super();
		this.x = x;
		this.y = y;
		this.r = r;
//		this.color = color;
	}
	
	public void draw() {
		System.out.printf("This is a %s circle with coords of centre (%d, %d) and radius %f\n", this.color, this.x, this.y, this.r);
	}
	
	public void scale(double k) {
		this.r *= k;
	}

}
