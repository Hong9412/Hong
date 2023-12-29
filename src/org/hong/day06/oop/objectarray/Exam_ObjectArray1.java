package org.hong.day06.oop.objectarray;

public class Exam_ObjectArray1 {
	public static void main(String[] args) {
		// 객체 배열 생성
		Circle [] cArrs = new Circle[5];	// 배열 생성 후 객체를 초기화 하기 위해
		System.out.println(cArrs[0]);
		// 배열 중 첫번째 공간에 객체 생성 후 필드 초기화 및 메소드 호출
		cArrs[0] = new Circle();			// new Circle() 한 번 더 해줘야 함!!!
		System.out.println(cArrs[0]);
		cArrs[0].radius = 10;
		System.out.println(cArrs[0].getArea());
		for(int i=0;i<cArrs.length; i++) {
			cArrs[i] = new Circle();
		}
		cArrs[0].radius = 1;
		cArrs[1].radius = 2;
		cArrs[2].radius = 3;
		cArrs[3].radius = 4;
		cArrs[4].radius = 5;
		System.out.println(cArrs[0].getArea());
		System.out.println(cArrs[1].getArea());
		System.out.println(cArrs[2].getArea());
		System.out.println(cArrs[3].getArea());
		System.out.println(cArrs[4].getArea());
	}
}
