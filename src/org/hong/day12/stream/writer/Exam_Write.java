package org.hong.day12.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/org/hong/day12/stream/writer/writing1.txt");
			char[] data = "Java/Oracle/JDB".toCharArray();
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush(); // 버퍼 비우기 해야 저장이 됨
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
