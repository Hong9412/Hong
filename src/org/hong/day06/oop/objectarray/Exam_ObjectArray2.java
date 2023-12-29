package org.hong.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {
	public static void main(String[] args) {
		Book books [] = new Book [2];		// 객체배열 시작
		Scanner sc = new Scanner(System.in);
		// 객체배열에 값 초기화
		for(int i=0;i<books.length;i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			books[i] = new Book();		// 꼭 쓰자 ^^*
			books[i].title = title;
			books[i].author = author;			
		}
		// 객체배열 출력
		for(int i=0;i<books.length;i++) {
			System.out.printf("(%s, %s)\n",books[i].title, books[i].author);
		}
	}
}
