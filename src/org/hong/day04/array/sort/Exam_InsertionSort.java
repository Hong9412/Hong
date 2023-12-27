package org.hong.day04.array.sort;

public class Exam_InsertionSort {
	public static void main(String [] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 오름차순, 작은거 찾아야 됌
		int arrs [] = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
		    for(int j = 0; j < i; j++) {
		        if(arrs[j] > arrs[i]) {
		            int temp = arrs[i];
		            arrs[i] = arrs[j];
		            arrs[j] = temp; // 교환
		        }
		    }
		}
		// 정렬된 배열 출력
		for(int i = 0; i < arrs.length; i++) {
		    System.out.print(arrs[i] + " ");
		}
		
		for(int j = 1; j < arrs.length; j++) {
		    for(int i = j; i >= 1; i--) {
		        if(arrs[i-1] > arrs[i]) {
		            int temp = arrs[i];
		            arrs[i] = arrs[i-1];
		            arrs[i-1] = temp;
		        }
		    }
		}

	}
}
