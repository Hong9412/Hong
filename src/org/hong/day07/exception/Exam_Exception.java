package org.hong.day07.exception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 :");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 :");
			int num2 = sc.nextInt();
			System.out.println("나눠드릴게요 조금만 기다리세요^^");
			int result = num1/num2;
			System.out.printf("몫은 %d입니다.",result);			
		} catch (Exception e) {
			System.out.print("어? 0으로 못 나누는데...?");
		}
	}
}

