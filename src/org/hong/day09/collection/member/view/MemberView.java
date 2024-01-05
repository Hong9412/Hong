package org.hong.day09.collection.member.view;

import java.util.List;
import java.util.Scanner;

import org.hong.day09.collection.member.controller.MemberController;
import org.hong.day09.collection.member.model.Member;
import org.hong.day09.collection.student.Student;

public class MemberView {
	MemberController mController;
	
	public MemberView() {
		mController = new MemberController();
	}
	public void startProgram() {
		end :
			while(true) {
				int choice = this.printMenu();
				switch(choice) {
				case 1 : this.inputMember(); break;
				case 2 : this.modifyMember(); break;
				case 3 : this.removeMember(); break;
				case 4 : this.printOneMember(); break;
				case 5 : this.printAllMember(); break;
				case 6 : this.displayMsg("프로그램이 종료되었습니다."); break end;
				default : this.displayMsg("1 ~ 6사이의 수를 입력해주세요."); break;
				}
			}
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(아이디)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputMember() {
		// ====== 회원 정보 등록 ======
		// 아이디 : khuser01
		// 비밀번호 : pass01
		// 이름 : 홍용자
		// 이메일 : khuser01@kh.com
		// 전화번호 : 01043564563
		// 정보를 저장중입니다...
		// 저장완료!
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("전화번호 : ");
		String phone = sc.next();
		member.setId(id);
		member.setPassWord(password);
		member.setName(name);
		member.setEmail(email);
		member.setPhone(phone);		
		mController.addMember(member);
	}
	
	public void modifyMember() {
		Scanner sc = new Scanner(System.in);
		List<Member> members = mController.updateMember();
		// ====== 회원 정보 수정 ======
		// 아이디를 입력해주세요 : khuser01
		// 수정할 정보를 입력해주세요
		// 비밀번호 : pass11
		// 이메일 : hongyj@naver.com
		// 전화번호 : 01028039412
		// 정보를 수정중입니다...
		// 수정완료!
		
		// ====== 회원 정보 수정 ======
		// 아이디를 입력해주세요 : khuser11
		// 회원정보가 존재하지 않습니다.
		System.out.println("====== 회원 정보 수정 ======");
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.next();
		for(int i = 0; i < members.size();i++) {
			if(id.equals(members.get(i).getId())) {
			System.out.println("수정할 정보를 입력해주세요");
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			}else {
				System.out.println("회원정보가 존재하지 않습니다.");
			}
		}
		}

	
	public void removeMember() {
		Scanner sc = new Scanner(System.in);
		// ====== 회원 정보 삭제 ======
		// 삭제할 회원의 아이디를 입력해주세요 : khuser01
		// 정보를 삭제중입니다...
		// 삭제완료!
		
		// ====== 회원 정보 삭제 ======
		// 삭제할 회원의 아이디를 입력해주세요 : khuser11
		// 회원정보가 존재하지 않습니다.
		List<Member> members = mController.findAllMember();
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("삭제할 회원의 아이디를 입력해주세요 : ");
		String id = sc.next();
		for(int i=0;i<members.size();i++) {
			if(id.equals(members.get(i).getId())) {
				members.remove(i).getId();
				System.out.println("정보를 삭제중입니다...");
				System.out.println("삭제완료");
				break;
			}else {
				System.out.println("회원정보가 존재하지 않습니다.");
			}		
		}
	}
	
	public void printOneMember() {
		// ====== 회원 정보 출력(아이디) ======
		// 아이디 : khuser01, 이름 : 홍용자, 이메일 : hongyj@naver.com, 폰번호 : 01028039412
		Scanner sc = new Scanner(System.in);
		List<Member> members = mController.findAllMember();
		System.out.println("====== 회원 전체 정보 출력 ======");
		System.out.print("회원 아이디 입력:");
		String id = sc.next();
		for(int i=0;i<members.size();i++) {
			if(id.equals(members.get(i).getId())) {	
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s \n"
							,members.get(i).getId(), members.get(i).getName()
							,members.get(i).getEmail(), members.get(i).getPhone());
			break;
		}else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}
	}
	public void printAllMember() {
		// ====== 회원 전체 정보 출력 ======
		// 아이디 : khuser01, 이름 : 홍용자, 이메일 : hongyj@naver.com, 폰번호 : 01028039412
		// 아이디 : khuser02, 이름 : 이용자, 이메일 : khuser02@naver.com, 폰번호 : 01044576255
		// 아이디 : khuser03, 이름 : 삼용자, 이메일 : khuser03@naver.com, 폰번호 : 01065489785
		// 아이디 : khuser04, 이름 : 사용자, 이메일 : khuser04@naver.com, 폰번호 : 01025669863
		// 아이디 : khuser05, 이름 : 오용자, 이메일 : khuser05@naver.com, 폰번호 : 01013354219
		// 아이디 : khuser06, 이름 : 육용자, 이메일 : khuser06@naver.com, 폰번호 : 01089903002
		List<Member> members = mController.findAllMember();
		System.out.println("====== 회원 전체 정보 출력 ======");
		for(int i=0;i<members.size();i++) {
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s \n"
							,members.get(i).getId(), members.get(i).getName()
							,members.get(i).getEmail(), members.get(i).getPhone());
		}
	}
	
	
	// 메세지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}




