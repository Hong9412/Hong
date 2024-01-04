package org.hong.day08.oop.polymorphism.overriding;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}
