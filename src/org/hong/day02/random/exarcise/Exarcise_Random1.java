package org.hong.day02.random.exarcise;

import java.util.Random;
import java.util.Scanner;

public class Exarcise_Random1 {
	public static void main(String [] args) {
		// 동전 앞뒤 맞추기!!
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		//맞췄습니다.
		
		// 동전 앞뒤 맞추기!!
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 2
		//맞췄습니다.
		
		// 동전 앞뒤 맞추기!!
		// 숫자를 입력해주세요(1.앞면 / 2.뒷면) : 1
		// 틀렸습니다.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		// for문
		// for(int i = 0; i < 10; i++) { 실행문 }
		// for(;;) { 실행문 } 무한반복
		for(;;) {
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
			int num = sc.nextInt();
			int rannum = rand.nextInt(2)+1;
			if((num >=1)&&(num <=2)) {
				if (num == rannum) {
					System.out.println("욜~ 맞췄습니다!");
				}else {
					System.out.println("틀렸습니다ㅠㅠ");
				}			
			}else {
				System.out.println("1또는 2를 입력해라");
			}	
		}
	}
}
