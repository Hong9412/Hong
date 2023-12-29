package org.hong.day06.oop.objectarray;

public class Circle {
	public int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
}