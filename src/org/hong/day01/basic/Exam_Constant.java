package org.hong.day01.basic;

public class Exam_Constant {
 public static void main(String [] args) {
	 // 변수는 소문자로 시작!!
	 // 상수는 모두 대문자
	 final double PI =  3.14;
	 System.out.println(PI);
	 // 원의 넓이 구하는 식
	 // PI * r * r 
	 double r = 10.2;
	 r = 5.4;
	 // PI = 3.24; 재할당 불가능 -> 변하지 않는 수 -> 상수
	 double circleArea = r * r * PI;
	 System.out.println("원의 면적 : " + circleArea);
 }
}
