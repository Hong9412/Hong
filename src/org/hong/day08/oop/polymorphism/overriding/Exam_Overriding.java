package org.hong.day08.oop.polymorphism.overriding;

class Super {
	protected int money;
	
	public Super() {
		money = 100000000;
	}
	
	public void manageStore() {
		System.out.println("매장운영st : 고객만족");
	}
}

class Sub extends Super {
	// 다향성 사례2
	// 메소드 오버라이딩
	// 접근지정자, 반환형, 메소드명 모두 일치 후
	// 실행문만 달라지는 것
	// 오직 상속관계에서 볼 수 있음
	public void manageStore() {
		System.out.println("매장운영st : 매출상승");
	}
}
public class Exam_Overriding {
	// 1. 오버라이딩은 상속관계에서 사용가능
	// 2. 오버라이딩 다 똑같고(접근지정, 반환형, 메소드명, 매개변수)
	// 실행문만 재정의
	// 3. 오버라이딩이 되면 동적바인딩이 되어 다향성을 이용할 수 있음.
	
	static void paint(Shape shape) {
		shape.draw();
	}	
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		Circle circle = new Circle();
		paint(shape);
		paint(circle);
		paint(new Line());
		paint(new Rectangle());
	}
}
