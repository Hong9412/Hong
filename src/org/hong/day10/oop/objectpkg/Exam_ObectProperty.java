package org.hong.day10.oop.objectpkg;

public class Exam_ObectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		// 문자열로 출력하고 싶으면 오버라이딩 필수!
		System.out.println("객체 출력 : " + obj);
		// toString()은 생략 가능함.
		// 객체를 출력하면 toString()의 결과로 출력이 됨
	}
	
	
	public static void main(String[] args) {
		print(new Exam_ObectProperty());
		
		
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
//		if(javaStr == "Java") {			// 같습니다.(주소같음)
//		if(javaStr2 == "Java") {		// 같습니다.(주소같음)
//		if(javaStr3 == "Java") {		// 다릅니다.(주소다름, new를 씀)	
		if(javaStr3.equals(javaStr3)) {	// 같습니다.(문자열 비교는 equals)
										// equals는 object클래스의 메소드
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}
