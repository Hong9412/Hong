package org.hong.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.hong.day10.oop.member.model.vo.Member;

public class MemberController {
	// Member List를 저장소로 가지고 있으며 추가, 삭제, 출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember
	
	// 저장소
	List<Member> members;
	
	
	public MemberController() {
		members = new ArrayList<Member>();
	}

	
	
	// 회원 정보 등록
	public void addMember(Member member) {
		members.add(member);
	}
	// 회원 정보 삭제
	public void deleteMember(String memberId) {	
//		for(Member member : members) {
		for(int i=0; i < members.size();i++) {
			Member member = members.get(i);
			if(memberId.equals(member.getMemberId())) {
				members.remove(i);
				break;
			}
		}
	}

	
	
	
	// 회원 정체 정보
	public List<Member> printAllMembers() {
		return members;
	}

	
	// 회원 정보 아이디로 검색
	public Member printOnebyId(String memberId) {
		for(Member member : members) {
			if(memberId.equals(member.getMemberId())) {
				return member;				
			}
		}
		return null;
	}



	public void modiftMember(String memberId, Member updateMember) {
		for(int i=0; i< members.size();i++) {
				//	===================== 원래 저장되어 있는 데이터===============
			Member member = members.get(i);
				//	===================== 입력한 id와 같은지 비교  ===============
			if(memberId.equals(member.getMemberId())) {
				//	===================== 입력받은 데이터로 수정   ===============
					member.setMemberPw(updateMember.getMemberPw());
					member.setMemberEmail(updateMember.getMemberEmail());
					member.setMemberPhone(updateMember.getMemberPhone());
				//	==============================================================
				//	===================== 수정된 데이터로 수정 ===================
					members.set(i, member);
				//	==============================================================
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}