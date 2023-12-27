package org.hong.day04.dimarray.exercise;

public class Exercise_DimArray3 {
	public static void main(String [] args) {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int arrs [][] = new int[5][5];
		int k = 1;
		for(int j=4;j>=0;j--) {
			for(int i=4;i>=0;i--) {
				arrs[j][i] = k++;
			}
		}
		for(int j=4;j>=0;j--) {
			for(int i=4;i>=0;i--) {
				System.out.print(arrs[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
