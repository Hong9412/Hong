package org.hong.day04.array.sort;

import java.util.Arrays;

public class Exam_SortMethod {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		int arrs [] = {11, 13, 4, 2, 6};
		Arrays.sort(arrs);
//		for(int i = 0;i<arrs.length;i++) {}
		for(int i : arrs) {
			System.out.print(i + " ");
		}
	}
}
