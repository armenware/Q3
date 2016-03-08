package base;

import base.GeometricObject;

public class Triangle extends GeometricObject {
	// data fields for the three sides and accessor methods
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// no arg constructor
	public Triangle() {
	}

	// constructor that creates a triangle with specified sides.
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// returns sides different from the default
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// perimeter of the triangle
	public double getPerimeter() {

		return (this.side1 + this.side2 + this.side3);
	}

	// area of the triangle
	public double getArea() {

		// hP is half the perimeter
		double hP = (getPerimeter() / 2);
		return Math.sqrt(hP * (hP - getSide1()) * (hP - getSide2()) * (hP - getSide3()));
	}

	// Triangle description with the sides
	public String toString() {
		return String.format("Triangle: \nSide 1 = " + side1 + "\nSide 2 = " + side2 + "\nSide 3 = " + side3);

	}
}
