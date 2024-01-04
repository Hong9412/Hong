package org.hong.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
		// 추상클래스와 마찬가지로 인터페이스로 객체 생성 불가
		// 업캐스팅을 통한 객체 생성 후 사용해야 함.
		Phoneinterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		
	}
}
