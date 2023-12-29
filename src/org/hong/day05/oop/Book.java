package org.hong.day05.oop;

public class Book {
	// 제목과 저자를 나타내는 필드를 가진 Book클래스를 작성하고
	// 생성자를 작성하여 필드를 초기화하여라~
	public String title;
	public String author;
	// 기본 생성자 (매개변수 생성자가 아님)
	// **매개변수 생성자를 만들 시에 반드시 기본생성자도 같이 써주세요**
	public Book() {
		title = "";
		author = "";
	}
	// 매개변수 있는 생성자
	public Book(String title) {
		this.title = title;
	}
	// 매개변수 2개 있는 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
