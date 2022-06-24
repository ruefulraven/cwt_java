package com.shape;

public class Square implements Polygon{
	
	private float side;
	
	public Square(float side) {
		this.side = side;
	}
	
	@Override
	public void calcArea() {
		System.out.println("Area of Square is: " + (Math.pow(2, side)));
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Square is: " + (4 * side));
		
	}

}
