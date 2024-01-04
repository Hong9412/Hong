package org.hong.day07.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를
		// 출력하고 다시 입력 받는 프로그램을 작성하여라
		Scanner sc = new Scanner(System.in);
		// 무한 반복문을 아십니까?
		// for(;;) {실행문}, while(true) {실행문}
		while (true) {
			try {
				System.out.print("정수 입력 :");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 :");
				int num2 = sc.nextInt();
				System.out.println("나눠드릴게요 조금만 기다리세요^^");
				int result = num1 / num2;
				System.out.printf("%d을 %d으로 나누면 몫은 %d입니다.\n", num1, num2, result);
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다!");
			}
		}
		
	}
	public void exercise2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는
		// InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for(int i=0;i<3;i++) {
			try {
				sum += sc.nextInt();	// ㄱ	// 0 1				
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!!");
				sc.next();	// 입력한 ㄱ을 제거하여 정수를 입력받게 해줌
				i--;		// 순서를 이전으로 조정하여 정수를 입력받게 해줌
			}
		}			
		System.out.printf("합은 %d\n",sum);			
	}
	
	public void exercise3() {
		// 범위를 벗어난 배열의 접근
		// ArrayIndexOutOfBoundsException
		int intArrs [] = new int[5];
		try {
			System.out.println(intArrs[5]);			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
	
	public void exercise4() {
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// NumberFormatException
		String [] str = new String[2];
		str[0] = "426";
		str[1] = "11.13";
		// String -> Int
		try {
			int result1 = Integer.parseInt(str[0]);
			System.out.println("숫자로 변환된 값은 " + result1);
			int result2 = Integer.parseInt(str[1]);
			System.out.println("숫자로 변환된 값은 " + result2);			
		} catch (Exception e) {
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}
 	}
	
	public void exercise5() {
		// Null값을 참조할 때 발생
		// NullpointerException
		try {
			String str = null;
			if(str.equals("null")) {
				System.out.println("같습니다.");
			}else {
				System.out.println("다릅니다.");
			}			
		} catch (Exception e) {
			System.out.println("Null값을 참조하였습니다.");
		}
	}
	
	
}
