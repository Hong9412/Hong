package org.hong.day05.oop;

public class Circle {
	public int radius;
	public String name;		// 필드(멤버변수)
	
	// 생성자
	// 1. 클래스 이름과 똑같음 메소드
	// 2. 객체 생성 시 최초 1번 실행됨
	// 3. 필드값을 초기화 함. => 객체 초기화
	public Circle() {	
		radius = 1;
		name = "일용자";
	}
	
	public double getArea() {		// 메소드(멤버메소드)
		return 3.14*radius*radius;
	}
	
	public static void main(String [] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "승환스피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "승환쓰도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	
	}
}
