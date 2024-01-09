package org.hong.day11.sort;

public class Exam_sortRecap {
	public void insertionSort() {	// 삽입정렬
		// N번 인덱스 값을 0번에서 n-1번 인덱스까지 비교함
		// N은 1부터 시작
		int arrs [] = {23, 11, 13, 24, 4, 25}; 
		// 삽입정렬은 왼쪽으로 작은값으로 정렬
		for(int j = 1; j < arrs.length; j++) {
		    for(int i = j; i >= 1; i--) {
		        if(arrs[i-1] > arrs[i]) {
		            int temp = arrs[i];
		            arrs[i] = arrs[i-1];
		            arrs[i-1] = temp;
		        }
		    }
		}
		for(int i:arrs) {
		    System.out.print(i + " ");
		}
}

	

	public void selectionSort() {
		// 배열을 전부 검색하여 최소값을 찾고 왼쪽부터 채워나가는 정렬
		// 배열의 n번 인덱스값을 n+1번에서 마지막 인덱스까지 비교함.
		int nums [] = {23, 11, 13, 24, 4, 25};
		
		int min = 0;
		for(int i=0;i<nums.length;i++) {
			min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[min]>nums[j]) {
					min = j;
				}
			}  // 첫번째로 제일 작은 값을 찾음
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
			// 그 값은 첫번째 위치와 바꿈
		} 
		
		for(int i:nums) {
			System.out.print(i + " ");
		}
		
//		for(int j = 0; j < nums.length-1; j++) {
//		    for(int i = j+1; i < nums.length; i++) {
//		        if(nums[min] > nums[i]) {
//		            min = i;
//		        }
//		        int temp = nums[j];
//		        nums[j] = nums[min];
//		        nums[min] = temp;
//		    }    
//		}		
		// 1번 실행 4 23 11 13 24 25
		// 2번 실행 4 11 23 13 24 25
		// 3번 실행 4 11 13 23 24 25
		// 4번 실행 4 11 13 23 24 25
		// 5번 실행 4 11 13 23 24 25
	}
	



	public void bubbleSort() {
		// 버블정렬은 오른쪽부터 큰값으로 정렬
		int nums [] = {23, 11, 13, 24, 4, 25};
		// 23과 11 비교 -> 11 23
		// 23과 13 비교 -> 13 23
		// 23과 24 비교 -> 23 24 
		// 24와 4 비교  -> 4 24
		// 24와 25 비교 -> 24 25 // 비교는 5개
		if(nums[0] > nums[1]) {}
		if(nums[1] > nums[2]) {}
		if(nums[2] > nums[3]) {}
		if(nums[3] > nums[4]) {}
		if(nums[4] > nums[5]) {}
		// 11 13 23 4 24 25
		
		// 11과 13 비교 -> 11 13
		// 13과 23 비교 -> 13 23
		// 23과 4 비교 -> 4 23
		// 23과 24 비교 -> 23 24 // 비교는 4개
		if(nums[0] > nums[1]) {}
		if(nums[1] > nums[2]) {}
		if(nums[2] > nums[3]) {}
		if(nums[3] > nums[4]) {}
		// 11 13 4 23 24 25 
		
		// 11 13 -> 11 13 
		// 13 4 -> 4 13
		// 13 23  -> 13 23
		// 11 4 13 23 24 25 // 비교는 3개
		if(nums[0] > nums[1]) {}
		if(nums[1] > nums[2]) {}
		if(nums[2] > nums[3]) {}
		
		// 11 4 -> 4 11
		// 11 13 -> 11 13  // 비교는 2개
		if(nums[0] > nums[1]) {}
		if(nums[1] > nums[2]) {}
		
		// 4 11 -> 4 11	// 비교는 1개
		if(nums[0] > nums[1]) {}

		
		// 최종결과 : 4 11 13 23 24 25
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<(nums.length-1)-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}					
		}
		for(int i:nums) {
			System.out.print(i + " ");
		}
//		if(nums[0] > nums[1]) {}
//		if(nums[1] > nums[2]) {}
//		if(nums[2] > nums[3]) {}
//		if(nums[3] > nums[4]) {}
//		if(nums[4] > nums[5]) {}

	}
}
