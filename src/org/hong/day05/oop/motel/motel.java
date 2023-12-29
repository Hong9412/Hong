package org.hong.day05.oop.motel;

	public class motel {
		public boolean room[];
		
		public motel() {
			room = new boolean[10];
			for(int i=0;i<10;i++) {
				room[i] = false;
			}
		}	
		public void in(int check) {
			if(room[check-1] == false) {
				room[check-1] = true;
				System.out.print(check + "번 방에 입실하셨습니다\n");
			}else {
				System.out.print(check + "번 방은 현재 손님이 있습니다.\n");
			}
		}
		public void out(int check) {
			if(room[check-1] == true) {
				room[check-1] = false;
				System.out.print(check + "번 방에서 퇴실하셨습니다.\n");
			}else {
				System.out.print(check + "번 방은 현재 빈 방입니다.\n");
			}
		}
	    public void main() {
	        for (int i = 0; i < room.length; i++) {
	            if (room[i] == true) {
	                System.out.printf((i+1) + "번 방에는 현재 손님이 있습니다\n");
	            } else {
	                System.out.printf((i+1) + "번 방이 현재 비어있습니다.\n");
	            }
	        }
	    }
}
