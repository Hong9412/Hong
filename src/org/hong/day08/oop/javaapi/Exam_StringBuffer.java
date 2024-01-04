package org.hong.day08.oop.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		// 문자열을 연결해주는 클래스
		// 문자열 메소드 중 concat과 같은 역할을 하며
		// 메모리를 덜 사용한다는 특징이 있음.
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
//		data1 = data1 + data2 + data3;	// + 연산자를 이용해서 연결
		
//		concat() 메소드로 연결
		data1 = data1.concat(data2).concat(data3);	
		System.out.println("연결된 문자열 : " + data1);
		
		// StringBuffer 이용해서 연결 (메모리 절약)
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열 : " + stb.toString());
	}
}
