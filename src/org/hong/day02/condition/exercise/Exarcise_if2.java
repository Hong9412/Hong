package org.hong.day02.condition.exercise;

import java.util.Scanner;

public class Exarcise_if2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠어요? 가격을 알려드립니다 ");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노) ");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		int price = 0;
		if(menu.equals("에스프레소")) {
			price = 2500;
			//System.out.println("2500원입니다.");
		}else if(menu.equals("카푸치노")) {
			price = 3000;
			//System.out.println("3000원입니다.");
		}else if(menu.equals("카페라떼")) {
			price = 3500;
			//System.out.println("3500원입니다.");
		}else if(menu.equals("아메리카노")) {
			price = 2000;
			//System.out.println("2000원입니다.");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		if(price != 0) {
			System.out.println(price+"원입니다.");
		}
		
	switch(menu) {
		case "에스프레소" : 
		price = 2500; 
		//System.out.println("2500원입니다."); 
		break;
		case "카푸치노" : 
		price = 3500; 
		//System.out.println("3500원입니다."); 
		break;
		case "카페라떼" :
		price = 4500; 
		//System.out.println("3500원입니다."); 
			break;
		case "아메리카노" :
		price = 1500; 
		//System.out.println("3500원입니다."); 
			break;
		default : System.out.println("없는 메뉴입니다.");
	}
	if(price != 0) {
		System.out.println(price+"원입니다.");
	}
	}
	// switch ~ case
	// switch(변수명) {
	// case 값1 : 실행문; break;
	// case 값2 : 실행문; break;
	// case 값3 : 실행문; break;
	// case 값4 : 실행문; break;
	// default : 실행문; break;
	// }
}
	// 커피 메뉴를 입력 받고 가격을 알려주는
	// 프로그램을 작성하여라
	// 주문하시겠어요? 가격을 알려드립니다.
	// (에스프레소, 카푸치노, 카페라떼, 아메리카노)
	// 메뉴를 입력해주세요 : 에스프레소
	// 2500원입니다.
	
	// 메뉴를 입력해주세요 : 큐브라떼
	// 없는 메뉴입니다.
