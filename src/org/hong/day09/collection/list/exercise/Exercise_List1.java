package org.hong.day09.collection.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {
	public static void main(String[] args) {
		// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 
		// 출력하여라.
		
		// 1. 문자열만 삽입가능한 ArrayList 컬렉션 생성
		
		// 2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		
		// 3. ArrayList에 들어있는 모든 이름 출력
		
		// 4. 가장 긴 이름 출력
		
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
//		String name [] = new String[4];			// 굳이... 
//		for(int i=0;i<4;i++) {
//			System.out.print((i+1) + "번째 이름을 입력 : ");
//			name[i] = sc.nextLine();
//			list.add(name[i]);
//		}
		
		//	입력 바로 받기 
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력해주세요 : ");
			list.add(sc.next());
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print(list.get(i) + "  ");			
		}
		System.out.println();
		int longName = 0;
		for(int i=1;i<list.size();i++) {
			if(list.get(longName).length() < list.get(i).length()) {
				longName = i;
			}
		}
		System.out.println();
		System.out.print("가장 긴 이름은 : " + list.get(longName));
		sc.close();
	}
}
