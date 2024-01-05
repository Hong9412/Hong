package org.hong.day10.oop.member.view;

import java.util.List;
import java.util.Scanner;


import org.hong.day10.oop.member.controller.MemberController;
import org.hong.day10.oop.member.model.vo.Member;

public class MemberView {
		MemberController mController;
		
		public MemberView() {
			mController = new MemberController();
		}
	
		public void starProgram() {
			theend : 
			while(true) {
				int choice = this.printMenu();
				String memberId = "";
				// 1. 등록 -> 5. 출력 -> 4. 검색출력 -> 3. 삭제 -> 2. 수정
				switch(choice) {
				case 1 : this.inputMember(); break; 
				case 2 : 
					memberId = this.inputMemberId();
					this.modifyMember(memberId);
					break; 
				case 3 :					
					memberId = this.inputMemberId();
					if(this.printOneMember(memberId) < 0) break;
					mController.deleteMember(memberId);
					this.displayMessage("정보를 삭제중입니다...");
					try {
						Thread.sleep(1000);				
					} catch (Exception e) {
						
					}
					displayMessage("삭제완료!");
					break; 
				case 4 :
					memberId = this.inputMemberId();
					this.printOneMember(memberId);
					break; 
				case 5 : this.printAllMembers(); break; 
				case 6 : System.out.println("프로그램이 종료되었습니다."); break theend; 
				}
			}
		}

		public int printMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("로딩중입니다.. 잠시만 기다려주세요...");
			try {
				Thread.sleep(1000);				
			} catch (Exception e) {
				e.printStackTrace();
			}
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
		public String inputMemberId() {
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.print("아이디를 입력해주세요 : ");
			String memberId = sc.next();
			System.out.println("");
			return memberId;
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
			System.out.println("====== 회원 정보 등록 ======");
			System.out.print("아이디 : ");
			String memberId = sc.next();
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("이름 : ");
			String memberName = sc.next();
			System.out.print("이메일 : ");
			String memberEmail = sc.next();
			System.out.print("전화번호 : ");
			String memberPhone = sc.next();
//			Member member = new Member();
//			member.setId(memberId);
//			member.setPassWord(memberPw);
//			member.setName(memberName);
//			member.setEmail(memberEmail);
//			member.setPhone(memberPhone);	
			Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
			System.out.println("정보를 저장중입니다...");
			mController.addMember(member);
			try {
				Thread.sleep(1000);				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("저장완료!");		
		}
		
		
		public void modifyMember(String memberId) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("수정할 정보를 입력해주세요");
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("이메일 : ");
			String memberEmail = sc.next();
			System.out.print("전화번호 : ");
			String memberPhone = sc.next();
			Member member = new Member(memberPw, memberEmail, memberPhone);
			System.out.println("정보를 수정중입니다...");
			try {
				mController.modiftMember(memberId, member);
				Thread.sleep(1000);				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("수정완료!");	
		}
		
		public void removeMember() {}
		
		
		public int printOneMember(String memberId) {
			Member members = (Member) mController.printOnebyId(memberId);
			System.out.println("====== 회원 정보 출력(아이디) ======");
				if(members == null) {
					System.out.println("존재하지 않는 정보입니다.");	
					return -1;
				}else {
					System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s \n"
							,members.getMemberId(), members.getMemberName()
							,members.getMemberEmail(), members.getMemberPhone());
				return 1;
		}
		}
		
		public void printAllMembers() {
			System.out.println("====== 회원 전체 정보 출력 ======");
			List<Member> members = mController.printAllMembers();
			for(int i=0;i<members.size();i++) {
				System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s \n"
								,members.get(i).getMemberId(), members.get(i).getMemberName()
								,members.get(i).getMemberEmail(), members.get(i).getMemberPhone());
			}
		}		
		
		public void displayMessage(String msg) {
			System.out.println(msg);
		}	
}
		