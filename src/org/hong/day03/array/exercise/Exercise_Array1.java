package org.hong.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String [] args) {
		
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라.
		// 단, 배열의 크기는 5이다.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int nums [] = new int[5];
		double sum = 0;
		for(int i=0;i<nums.length;i++) {
			System.out.print((i+1)+"번째 수는 : ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
	
		System.out.print("입력한 값의 평균은 : " + sum/nums.length);
		
		
		
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는
		// 프로그램을 작성하시오.
//		int nums [];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("양수 5개 입력해라");
//		nums = new int [5];
//		for(int i=0;i<5;i++) {
//				System.out.print((i+1)+"번째 양수 : ");
//				nums[i] = sc.nextInt();	
//		if(nums[i] < 0) {
//			System.out.print("양수를 입력해주세요..");
//			break;
//		}
//		}
//		int max = nums[0];
//        for (int i = 1; i < 5; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//		System.out.println("가장 큰 수는 : " + max);
	}
}
