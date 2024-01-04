package org.hong.day08.oop.polymorphism.overriding;

public class Shape {
	private String name;		// 캡슐화
	
	public void draw() {
		System.out.println("Shape Something");
	}
	
	// getter 메소드
	public String getName() {
		return this.name;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
}
