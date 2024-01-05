package org.hong.day09.collection.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.hong.day09.collection.member.model.Member;
import org.hong.day09.collection.student.Student;

public class MemberController {
	// Member List를 저장소로 가지고 있으며 추가, 삭제, 출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember
	
	// 저장소
	List<Member> members;
	
	public MemberController() {
		members = new ArrayList<Member>();
	}
	
	// 저장
	public void addMember(Member member) {
		members.add(member);
	}

	// 수정
	public void updateMember(int index, Member member) {
		members.set(index, member);
	}
	// 삭제 
	public void deleteMember(Member member) {
		members.remove(member);
	}
	// 출력
	public Member findMember(int index) {
		return members.get(index);	
	}
	
	// 전체 출력
	public List<Member> findAllMember() {
		return members;		
	}
}
