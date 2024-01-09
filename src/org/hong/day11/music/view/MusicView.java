package org.hong.day11.music.view;

import java.util.List;
import java.util.Scanner;

import org.hong.day11.music.controller.MusicController;
import org.hong.day11.music.model.vo.Music;

public class MusicView {
	MusicController musicCtrl = new MusicController();
	// 실행프로그램
	public void launchApp() { // switch case문
		theend: 
		while(true) {
			int choice = this.printMainMenu();
			Music music = null;
			String title = "";
			switch(choice) {
			case 1:
				// 가수명, 곡명을 입력받음
				music = this.inputMusic();
				// 마지막 위치에 추가
				musicCtrl.addMusic(music);
				break;
			case 2:
				// 가수명 곡명을 입력받음
				music = this.inputMusic();
				// 첫 위치에 추가
				musicCtrl.firstaddMusic(music);
				break;
			case 3: 
				// 전체 곡 목록을 가져옴
				List<Music> mList = musicCtrl.printAllMusics();
				// View에 있는 메소드를 이용하여 출력함.
				this.printAllMusics(mList);
				break;
			case 4:
				title = this.inputTitle();
				music = musicCtrl.findOneByTitle(title);
				this.printOne(music);
				break;
			case 5:
				title = this.inputTitle();
				musicCtrl.removeOne(title);
				break;
			case 6:
				music = this.modifyTitle();
				musicCtrl.modifyMusic(music);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 0: 
				System.out.println("프로그램이 종료되었습니다.");
				break theend;
			}
		}
	}
	private Music modifyTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		Music music = musicCtrl.findOneByTitle(title);
		if(music == null) {
			System.out.println("존재하지 않는 정보입니다.");
			return null;
		}else {
			this.printOne(music);
			System.out.print("수정할 가수명을 입력해주세요 : ");
			music.setSinger(sc.nextLine());
			System.out.print("수정할 곡명을 입력해주세요 : ");
			music.setTitle(sc.nextLine());
			return music;
		}
	}
	// 곡명 입력
	public String inputTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		return title;
	}
	
	
	// 곡 추가
	public Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력해주세요: ");
		String title = sc.nextLine();		
		System.out.print("가수명을 입력해주세요: ");
		String singer = sc.nextLine();
//		Music music = new Music();
//		music.setTitle(title);
//		music.setSinger(singer);
		Music music = new Music(title, singer);
		// Music 객체 생성하여 반환
		return music;
	}

	// 곡 수정
		public void modifyMusic() {
			
		}

	// 메인메뉴
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ==="); 
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");		 
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제"); 
		System.out.println("6. 특정 곡 정보수정"); 
		System.out.println("7. 곡명 오름차순 정렬"); 
		System.out.println("8. 곡명 내림차순 정렬"); 
		System.out.println("9. 가수명 오름차순 정렬"); 
		System.out.println("10. 가수명 내림차순 정렬"); 
		System.out.println("0. 종료"); 		
		System.out.print("메뉴 선택: ");
		int choice = sc.nextInt();
		return choice;
	}
		
	// 전체 곡 목록 출력
	public void printAllMusics(List<Music> mList) {
		// mList를 이용하여 전체 곡 목록을 출력하는 코드 추가
		System.out.println("=== === 전체 곡 목록 출력 === ===");
		for(Music music : mList) {
			System.out.printf("가수명 : %s, 곡명 : %s\n"
					,music.getSinger(), music.getTitle());
		}
	}
	// 한 곡 출력
	public void printOne(Music music) {
		// TODO Auto-generated method stub
		System.out.printf("가수명 : %s, 곡명 : %s\n"
				,music.getSinger(), music.getTitle());
	}
	
	// 메시지 출력
	public void displayMessage(String message) {
		System.out.println(message);
	}

	// 가수 정렬
	private void arraySinger() {
		// TODO Auto-generated method stub
		
	}

	// 곡 정렬
	private void arrayMusic() {
		// TODO Auto-generated method stub
		
	}
	
}

