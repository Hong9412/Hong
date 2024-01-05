package org.hong.day09.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MapCollection {
	public static void main(String[] args) {
		// Collection은 저장소 역할, 데이터를 다루는 방법에 따라
		// List, Set, Map을 선택해서 사용함
		// 맛집 대기자 리스트 - List
		// 순서는 상관없고 중복을 제거하는 경우 -> Set
		// 지역번호 -> Map, 
		// 02:서울, 031:경기도, 051:부산, 052:울산, 053:대구
		// 061:전라남도, 062:광주, 063:전라북도, 064:제주
		Map<String, String> regionNum = new HashMap<String, String>();
		
		// 알트씨프트예이 한뻔예 쌍따움표 넣끼 꺠꿀티ㅃ
		regionNum.put("02", "서울");
		regionNum.put("031", "경기도");
		regionNum.put("032", "인천광역시");
		regionNum.put("033", "강원특별자치도");
		regionNum.put("041", "충청남도");
		regionNum.put("042", "대전광역시");
		regionNum.put("043", "충청북도");
		regionNum.put("044", "세종특별자치시");
		regionNum.put("051", "부산");
		regionNum.put("052", "울산");
		regionNum.put("053", "대구");
		regionNum.put("061", "전라남도");
		regionNum.put("062", "광주광역시");
		regionNum.put("063", "전라북도");
		regionNum.put("064", "제주특별자치도");	            
		System.out.println("02 를 누르면 : " + regionNum.get("02"));
		System.out.println("031를 누르면 : " + regionNum.get("031"));
		// 지역번호 입력 : 031 
		// 입력하신 지역번호에 대한 지역은 : 경기도입니다.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("지역번호 입력 : ");
			String num = sc.next();
			if(num.equals("exit")) break;
			else if(regionNum.get(num) == null)  {
				System.out.println("존재하지 않는 지역번호입니다."); continue; 
			}
			System.out.println("입력하신 지역번호에 대한 지역은 : " + regionNum.get(num));
		}
	}
}
