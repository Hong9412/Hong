package org.hong.day06.oop.student;

import java.util.Scanner;

public class StudentApp {
    static Student students [] = new Student[3];

    public static void main(String[] args) {
    	ManageStudent mngStd = new ManageStudent();
        끝 :
        while(true) {
            int choice = mngStd.printMenu();
            switch(choice) {
            case 1 : mngStd.inputScore(); break;
            case 2 : mngStd.printScore(); break;
            case 3 : mngStd.displayMsg("프로그램이 종료되었습니다."); break 끝;
            default : mngStd.displayMsg("1 ~ 3사이의 숫자를 입력해주세요."); break;
            }
        }
    }
}