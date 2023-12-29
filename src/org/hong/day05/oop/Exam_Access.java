package org.hong.day05.oop;
// 접근지정자(제한자)
// 종류 : public, protected, default, private
class sample {
	public int a;
	private int b;
	int c;
}
public class Exam_Access {
	public static void main(String[] args) {
		sample smp1 = new sample();
		smp1.a = 1113;
		// smp1.b = 426; // The field sample.b is not visible
		smp1.c = 1026;   // default
	}

}
