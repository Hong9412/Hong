package org.hong.day11.sort.run;

import org.hong.day11.sort.Exam_sortRecap;

public class Run {
	public static void main(String[] args) {
		Exam_sortRecap sort = new Exam_sortRecap();
		sort.bubbleSort();
		System.out.println();
		sort.insertionSort();
		System.out.println();
		sort.selectionSort();
	}
}
