package org.hong.day09.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();	// 어ㅃ꺠쓰띙
		list.add("김재원");
		list.add("임주현");
		list.add("홍경락");
		list.add("김재원");
		list.add("이창주");
		list.add("고진석");
		
		list.add(2, "손동주");
//		for(int i=0;i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		list.remove(2);
		for(int i=0;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void RListSample() {
		RList<Integer> list = new RList<Integer> ();
		list.add(1113);
		list.add(425);
		list.add(1600);
		
		int num = list.get(2);
		System.out.println("num : " + num);
	}

	public void ObjectSample() {
		ObjectList objList = new ObjectList();
		// 입력하려면 메소드 add()를 사용
		// 컬렉션 중 리스트
		objList.add(11.13);
		objList.add(425);
		objList.add("종강");
		// 출력
		double start = (double)objList.get(0);
		int end = (int)objList.get(1);
		String msg = (String)objList.get(2);
		System.out.println(objList.get(0));
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	
	
	public void IntListSample() {
		IntList nums = new IntList();
//		nums[0] = 1;
		nums.add(11);
		nums.add(13);
		nums.add(425);
//		System.out.println(nums[0]);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
//		System.out.println(nums.length);
		System.out.println("크기 : " + nums.size());
//		nums[0] = 0; nums[1] = 0; nums[2] = 0;
//		nums = new int[3];
		nums.clear();
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
	}
}
