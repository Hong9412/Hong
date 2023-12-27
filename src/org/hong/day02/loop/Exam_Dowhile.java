package org.hong.day02.loop;

public class Exam_Dowhile {
	public static void main(String [] args) {
		// 3. Do~While문
		// 초기식;
		// do { 실행문; 증감식; } while(조건식);
		int i = 0;
		do {
			System.out.print(i);
			i++;
		}while(i < 10);
	}
}
