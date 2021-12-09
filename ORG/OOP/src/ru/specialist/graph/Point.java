package ru.specialist.graph;
/*
 *  Shape
 * 	 static List<Shape> scene;
 * 	 static void drawScene()
 * 
 *   color
 *   Shape(color)
 *   draw()
 *  
 * 		Point
 * 			x,y
 * 			Point(x,y,color)
 * 			draw()
 * 			moveBy()
 * 		Circle
 * 			x,y,r
 * 			Circle(x,y,r,color)
 * 			draw()
 * 			scale(double)
 * 
 * 
 * 
 * 
 */



public class Point extends Shape {
	
	public int x;
	public int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this(x,y,DEFAULT_COLOR);
	}
	
	public Point(int x, int y, String color) {
		super(color);
		
		this.x = x;
		this.y = y;
		//this.color = color;
	}
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		System.out.printf("Point (%d, %d). %s\n", this.x, this.y, this.color);
		//super.draw();
	}
}
