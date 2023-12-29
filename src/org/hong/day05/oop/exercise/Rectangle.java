package org.hong.day05.oop.exercise;

public class Rectangle {
	// 너비와 높이를 입력받아 사각형의 넓이를 출력하는 클래스를 만드시오.
	// 단, 기본생성자를 포함하여 만드시오
	
	public int width;
	public int height;  //  ========== 필드
	
	public Rectangle() {} // ========= 생성자
	
	public double getAreas() { // ==== 메소드
		return height*width;
	}
	
}
