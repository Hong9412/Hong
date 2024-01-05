package org.hong.day09.collection.studentmvc.model;

public class Student {
	//                              필드(멤버변수)
	private String name;
	private int firstScore;
	private int secondScore;
	
	//                                 생성자
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	//                            getter/setter 메소드
	
	// name의 getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	// firstScore의 getter/setter
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	
	// secondScore의 getter/setter
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
}
