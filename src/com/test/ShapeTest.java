package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class ShapeTest {
	public static void main(String[] args) {
		Square sqr = new Square(4);
		sqr.calcArea();
		sqr.calcPeri();
		System.out.println();
		
		Rectangle rec = new Rectangle(12, 7);
		rec.calcArea();
		rec.calcPeri();
	}
}
