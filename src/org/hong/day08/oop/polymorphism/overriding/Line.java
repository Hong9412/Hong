package org.hong.day08.oop.polymorphism.overriding;
// Shape를 상속받은 후 draw() 메소드를 오버라이딩해보세요
// Draw Line

public class Line extends Shape{
	public void draw() {
		System.out.println("Draw Line");
	}
}
