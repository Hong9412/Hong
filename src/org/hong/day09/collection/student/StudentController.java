package org.hong.day09.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
//	Student[] students = new Student[3];
	List<Student> students;
	
	public StudentController() {
		students = new ArrayList<Student>();
	}
	
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	// 성적입력(이름, 점수1, 점수2)
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("첫번째 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("두번째 점수 : ");
		int secondScore = sc.nextInt();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		students.add(student);
//		for(int i=0;i<students.length;i++) {
//			students[i] = new Student();
//			System.out.print("이름 : ");
//			students[i].setName(sc.next());
//			System.out.print("첫번째 점수 :");
//			students[i].setFirstScore(sc.nextInt());
//			System.out.print("두번째 점수 : ");
//			students[i].setSecondScore(sc.nextInt());	
//		}
	}
	// 성적출력
	public void printScore() {
		for(int i=0;i<students.size();i++) {
			System.out.println("======"+(i+1)+"번째 학생의 정보 출력 ======");
			System.out.printf("%s 학생의 첫번째 점수는 %d점, 두번째 점수는 %d점입니다.\n"
					, students.get(i).getName()
					, students.get(i).getFirstScore()
					, students.get(i).getSecondScore());
		}
//		System.out.println("======"+(i+1)+"번쨰 학생의 정보 출력 ======");
//		System.out.printf("%s 학생의 첫번째 점수는 %d점, 두번째 점수는 %d점입니다.\n",
//				students[i].getName(),
//				students[i].getFirstScore(), 
//				students[i].getSecondScore());
	}
	// 메세지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
