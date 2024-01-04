package org.hong.day08.oop.polymorphism.overloading;

class Weapon {
	public Weapon() {}
	public Weapon(int value) {}
	public Weapon(String name) {}
	public Weapon(int value, String name) {}
}



public class Exam_Overloading {
	
	public Exam_Overloading() {}
	public Exam_Overloading(String name) {}
	public Exam_Overloading(int score) {}
	
	
	public static void main(String[] args) {
		// 다향성 사례1
		// 메소드 오버로딩
		// 오버로딩이 없다면
		// 전달값마다 다른 이르므의 메소드가 필요
		// 이름만 똑같고 전달값의 갯수나 타입이
		// 달라지는 경우
		System.out.println("Hello World");
		System.out.println('A');
		System.out.println(13);
		System.out.println(4.25);
	}
}
