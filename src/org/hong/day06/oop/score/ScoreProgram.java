package org.hong.day06.oop.score;

import java.util.Scanner;

import org.hong.day05.oop.motel.motel;

public class ScoreProgram {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
//		boolean truefalse = true;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0; 	// case1 안에서 선언된 변수(kor,eng,math,sum,avg)는 case2에서 사용 못 함)
		// 지역변수의 개념이고 case1, case2에서 모두 쓰려면 밖에서 선언하여
		// 사용해야 함. 이것이 전역변수의 개념임.
		while (true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int num = sc.nextInt();
//		if (num>3||num<1) {
//			System.out.println("메뉴를 잘못입력하셨습니다.");
//			continue;
//		}
		switch (num) {
		case 1:
			System.out.println("====== 성적 입력 ======");
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			math = sc.nextInt();
			sum = (kor+eng+math);
			avg = sum/(double)3;
			break;
		case 2: 
			System.out.println("====== 성적 출력 ======");
			System.out.print("국어 : " + kor +"\n");
			System.out.print("영어 : " + eng +"\n");
			System.out.print("수학 : " + math +"\n");
			System.out.print("총점 : " + sum + "\n");
			System.out.print("평균 : " + avg + "\n");
			break;
		case 3:
			System.out.println("프로그램이 종료되었습니다.");
			return;
			default : System.out.println("1 ~ 3 사이의 숫자를 입력해주세요."); break;
		}
	}
		
	}
}
