package org.hong.day08.oop.polymorphism;

class SuperClass {
	void paint() {
		draw();			// 동적바인딩에 의해 SuperClass의 draw()가 아닌
						// SubClass의 draw()가 실행됨
	}
	void draw() {
		System.out.println("Super object");
	}
}

class SubClass extends SuperClass{
	void paint() {	
		// super는 부모가 가진 메소드를 실행!
		super.paint();	// SuperClass의 paint() 실행
						// 실행결과 : Sub object
		super.draw();	// SuperClass의 draw() 실행
						// 실행결과 : Super object
	}
	void draw() {
		System.out.println("Sub object");
	}
}

public class SampleProgram {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();	// 부모 타입의 참조 변수로
										// 자식객체를 다루는 것
										// 업캐스팅
		ex.paint();
		ex.draw();		
	}
}
