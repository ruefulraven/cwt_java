package com.shape;

public class Rectangle implements Polygon{

	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void calcArea() {
		System.out.println("Area of Rectangle is: " + (length * breadth));
	}
	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Rectangle is: " + ((2 * length) + (2 * breadth)));
		
	}
	
	
}
