package org.hong.day10.oop.motel.view;

import java.util.List;
import java.util.Scanner;

import org.hong.day10.oop.motel.controller.MotelController;
import org.hong.day10.oop.motel.model.vo.Room;

public class MotelView {
	MotelController mController;
	
	public MotelView() {
		mController = new MotelController();
	}
	
	public void launchProgram() {
		end :
		for(;;) {
			int choice = this.printMainMenu();
			switch(choice) {
			case 1 : this.checkIn(); break;
			case 2 :this.checkOut(); break;
			case 3 :this.printAllRooms();break;
			case 4 : this.displayMessage("프로그램을 종료합니다");  break end;
			}
		}
	}
	
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실\t2.퇴실\t3.방보기  4.종료\n");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번방에 입실하시겠습니까?");
		int roomNum = sc.nextInt();
		mController.checkIn(roomNum);	
	}
	
	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번방에 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();
		mController.checkOut(roomNum);
	}
	public void printAllRooms() {
		int i = 1;
		List<Room> rooms = mController.printAllRooms();
		for(Room r : rooms) {
			if(r.isAvailable()) {
				System.out.println(i + "번째 방은 현재 손님이 있습니다.");				
			}else {
				System.out.println(i + "번째 방은 현재 비어 있습니다.");				
			}
			i++;
		}
	}
	
	public void displayMessage(String msg) {
		System.out.println(msg);
	}	

}
