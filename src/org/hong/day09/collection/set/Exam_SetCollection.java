package org.hong.day09.collection.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String[] args) {
		// Collection의 List, Set, Map -> 저장소 역할
		// Set은 집합의 역할
		// 집합의 특징 : 순서가 없음, 중복 안됨!
		Set<String> strSet = new HashSet<>();
		strSet.add("김재원");
		strSet.add("김승환");
		strSet.add("홍경락");
		strSet.add("박준영");
		strSet.add("김재원");
		System.out.println("크기 : " + strSet.size());
		System.out.println("값의 존재 체크 : " + strSet.isEmpty());
		
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		strSet.clear();
		System.out.println("크기 : " + strSet.size());
		System.out.println("값의 존재 체크 : " + strSet.isEmpty());
	}
}
