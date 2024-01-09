package org.hong.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null; // 추상클래스이기 때문에 new InputStream 못 씀!

		try {
			is = new FileInputStream("src/org/hong/day12/stream/inputstream/reading.txt");
			int readByte;
			do {
				readByte = is.read();
				System.out.print((char) readByte);
			} while (readByte != -1);
//			while(true) {
//				readByte = is.read();	// 한 바이트씩 읽어서 출력하는 read()
//				if(readByte == -1) break;
//				System.out.print((char)readByte);				
//			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생을 하든, 발생하지 않든 반드시 실행되는 코드
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
