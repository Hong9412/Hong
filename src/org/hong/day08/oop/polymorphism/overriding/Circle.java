package org.hong.day08.oop.polymorphism.overriding;

// Circle이 Shape을 상속받으려고 해요. 어떻게 해요?
public class Circle extends Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
	public static void main(String[] args) {
		Sub s = new Sub();
		Circle c = new Circle();
		c.draw();
	}
}
