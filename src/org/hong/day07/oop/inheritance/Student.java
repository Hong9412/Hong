package org.hong.day07.oop.inheritance;

public class Student extends Person{
	void set() {
		super.name = "일용자";
		super.age = 33;
		super.height = 185;
//		super.weight = 75;
		super.setWeight(75);
	}
}
