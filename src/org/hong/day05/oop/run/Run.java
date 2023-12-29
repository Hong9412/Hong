package org.hong.day05.oop.run;

import java.util.Random;
import java.util.Scanner;

import org.hong.day05.oop.Book;
import org.hong.day05.oop.Circle;
import org.hong.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args) {
		
//		Book book = new Book();
//		book.title = "춘향뎐";
		Book book1 = new Book("춘향뎐");
		System.out.printf("%s : %s\n", book1.title, "작자미상");
		
//		Book book = new Book();
//		book.title = "어린왕자";
//		book.author = "생택쥐페리";
		Book book2 = new Book("어린왕자", "상택쥐페리");
		System.out.printf("%s : %s\n", book2.title, book2.author);
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print("너비 입력 : ");
		rect.width = sc.nextInt();
		System.out.print("높이 입력 : ");
		rect.height = sc.nextInt();
		double result = rect.getAreas();
		System.out.println("해당 사각형의 넓이는 " + result + "입니다.");
		
		
		
		
		Random rand = new Random();
		for(int i=0;i<1;i++) {
		Circle pizza = new Circle();
		pizza.radius = rand.nextInt(500)+1;
		pizza.name = "승환스피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		}
		for(int i=0;i<1;i++) {
			Circle donut = new Circle();
			donut.radius = rand.nextInt(500)+1;
			donut.name = "승환쓰도넛";
			double area = donut.getArea();
			System.out.println(donut.name + "의 면적은 " + area);		
		}
	}
}
