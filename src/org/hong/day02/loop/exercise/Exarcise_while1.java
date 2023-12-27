package org.hong.day02.loop.exercise;

import java.util.Scanner;

public class Exarcise_while1 {
	public static void main(String [] args) {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == -1) {
				break;
			}
			sum += num;
		}
		System.out.print("입력받은 정수의 합은 : " + sum);
	}
}
