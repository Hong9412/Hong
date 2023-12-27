package org.hong.day02.condition.exercise;

import java.util.Scanner;

public class Exarcise_if1 {
	public static void main(String [] args) {
	// 점수와 학년을 입력 받아 60점 이상이면 합격
    // 미만이면 불합격을 출력한다
    // 단, 4학년의 경우 70점 이상이어야 합격을 출력한다.
    Scanner sc = new Scanner(System.in);
    System.out.print("점수를 입력하세요(0~100) : ");
    int score = sc.nextInt();
    System.out.print("학년을 입력하세요(1~4) : ");
    int grade = sc.nextInt();
    // if (조건식) { (실행문) }
    // if (조건식) { (실행문1) } else { (실행문2) }
    // if (조건식) { (실행문1) } else if(조건식) { (실행문2) }
    // else { (실행문3) }
    if (grade < 4 && score >= 60) {
        System.out.println("합격");
    } else if (grade == 4 && score >= 70) {
        System.out.println("합격");
    } else {
        System.out.println("불합격");
    }
}
}
