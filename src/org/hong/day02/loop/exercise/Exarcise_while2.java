package org.hong.day02.loop.exercise;

public class Exarcise_while2 {
	public static void main(String[] args) {
		int n = 1;
		int num = 0;
		// while (num < 100) {
		while (n <= 100) {
			if (n % 2 != 0) {
				num += n;
			}
			n++;
		}
		System.out.println(num);
	}
}
