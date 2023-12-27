package org.hong.day04.array;

public class Exam_DeepCopy {
	public static void main(String [] args) {
		// 깊은 복사
		int [] arigin = {1, 2, 3, 4};
		int [] copy = new int[4];
		for(int i=0;i<arigin.length;i++) {
			copy[i] = arigin[i];
		}
		arigin[1] = 11;
		copy[1] = 13;
		System.out.println(arigin[1]);
		System.out.println(copy[1]);
		
		
	}
}
