package org.hong.day04.array;

public class Exam_Hallowcopy {
	public static void main(String [] args) {
		int arrs1[] = new int[4];
		for(int i=0;i<arrs1.length;i++) {
			arrs1[i] = i*i;
		}
		System.out.printf("%d\n%d\n%d\n%d\n", arrs1[0], arrs1[1], arrs1[2], arrs1[3]);
		int arrs2 [] = arrs1;
		arrs1[1] = 11;
		arrs2[1] = 13;
		System.out.println(arrs1[1]);
		
	}
}
