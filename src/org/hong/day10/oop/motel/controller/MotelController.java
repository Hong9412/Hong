package org.hong.day10.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.hong.day10.oop.motel.model.vo.Room;


public class MotelController {
	// * VO 없이 할 수도 있음
	List<Boolean> roomb;
	List<Room> rooms;				// 룸 리스트 생성
	
	public MotelController() {
		roomb = new ArrayList<Boolean>();
		rooms = new ArrayList<Room>(10);		// 룸 값 10개 생성
		for(int i = 0; i < 10; i++) {
			rooms.add(new Room(false));				// 모든 방에 false 주기
		}
	}
	
	


	// 입실
	public void checkIn(int roomNum) {
		rooms.set(roomNum-1, new Room(true));			// 입실하면 true로 바꾸기
	}

	// 퇴실
	public void checkOut(int roomNum) {
		rooms.set(roomNum-1, new Room(false));			// 퇴실하면 false로 바꾸기
	}
	
	// 방보기
	public List<Room> printAllRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}




}
