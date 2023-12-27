package org.hong.day02.loop.exercise;

import java.util.Scanner;

public class Exarcise_calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char calcul = sc.next().charAt(0);
			int result = 0;
			switch(calcul) {
			case '+' : result = (num1+num2); break;
			case '-' : result = (num1-num2); break;
			case '*' : result = (num1*num2); break;
			case '/' : result = (num1/num2); break;
			case '%' : result = (num1%num2); break;
			}	
			System.out.printf("%d %c %d = %d\n", num1,calcul,num2,result);
		}
	}
}
