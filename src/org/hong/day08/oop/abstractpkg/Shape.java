package org.hong.day08.oop.abstractpkg;



public abstract class Shape {
	public Shape() {};
	// 몸체 없는 메소드인 추상메소드로 작성
	abstract public void draw();
	public void paint() {}
}

//추상메소드가 있는 클래스는 추상클래스가 됨
//추상클래스가 꼭 추상메소드를 가져야 되는 것은 아님
