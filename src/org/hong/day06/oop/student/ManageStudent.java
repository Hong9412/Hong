package org.hong.day06.oop.student;

import java.util.Scanner;

public class ManageStudent {
	  Student students [] = new Student[3];

	    public void inputScore() {
	        Scanner sc = new Scanner(System.in);
	        for(int i = 0; i < students.length; i++) {
	            students[i] = new Student();
	            System.out.print("이름 : ");
	            students[i].name = sc.next();
	            System.out.print("1번째 점수 : ");
	            students[i].firstScore = sc.nextInt();
	            System.out.print("2번째 점수 : ");
	            students[i].secondScore = sc.nextInt();
	        }
	    }
	    public void printScore() {
	        for(int i = 0; i < students.length; i++) {
	            System.out.println((i+1) +"번째 학생 정보 출력");
	            System.out.printf("%s 학생의 점수는 1차 : %d점, 2차 : %d점입니다.\n"
	                        ,students[i].name ,students[i].firstScore ,students[i].secondScore);
	        }
	    }
	    public void displayMsg(String msg) {
	        System.out.println(msg);
	    }
	    public int printMenu() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("====== 메인 메뉴 ======");
	        System.out.println("1. 성적입력");
	        System.out.println("2. 성적출력");
	        System.out.println("3. 종료");
	        System.out.print("선택 : ");
	        int choice = sc.nextInt();
	        return choice;
	    }
}
