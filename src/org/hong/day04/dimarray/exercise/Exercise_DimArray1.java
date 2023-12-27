package org.hong.day04.dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String [] args) {
		// TODO Auto-generated method stub

		
		// 5 4 3 2 1
		//         nums[0][4]
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		
		int arrs [][] = new int[5][5];
		int k = 1;
		for(int j=0;j<arrs.length;j++) {
			for(int i=0;i<arrs.length;i++) {
				arrs[i][j] = k++;
			}
		}
		for(int j=4;j>=0;j--) {
			for(int i=0;i<arrs.length;i++) {
				System.out.print(arrs[j][i] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
//		int arrs [][] = new int[5][5];
//		int k = 1;
//		for(int j=0;j<arrs.length;j++) {
//			for(int i=0;i<arrs.length;i++) {
//				arrs[j][i] = k++;
//			}
//		}
//		for(int j=0;j<arrs.length;j++) {
//			for(int i=0;i<arrs.length;i++) {
//				System.out.print(arrs[j][i] + " ");
//			}
//			System.out.println();
//		}
	}
}
