package org.hong.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.Reader;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요!
		Reader reader = null;
		try {
			reader = new FileReader("src/org/hong/day12/stream/exercise/Exam_FileCopy.java");
			int c;
			char[] cBuf = new char[1024];
			String result = "";
			try {
				while((c= reader.read(cBuf)) != -1) {
					result += new String(cBuf, 0, c);
				}
				System.out.println(result);
				System.out.println("코드 출력 완료!");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
