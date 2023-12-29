package org.hong.day05.oop.motel;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        motel mt = new motel();
        int num = 0;
        while (true) {
            System.out.println("모텔 관리 프로그램 v1.0");
            System.out.println("1.입실   2.퇴실   3.방보기   4.종료");
            System.out.print("선택 >");
            num = sc.nextInt();
            if (num > 4 || num < 1) {
                System.out.println("잘못 선택 하셨습니다");
                continue;
            }
            int roomNum = 0;
            switch (num) {
            case 1:
                System.out.println("몇번방에 입실하시겠습니까?");
                num = sc.nextInt();
                mt.in(num);
                break;
            case 2:
                System.out.print("몇번방에서 퇴실하시겠습니까?");
                num = sc.nextInt();
                mt.out(num);
                break;
            case 3:
                mt.main();
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }
	}

