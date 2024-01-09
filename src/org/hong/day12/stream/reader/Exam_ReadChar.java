package org.hong.day12.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/org/hong/day12/stream/reader/reading.txt");
			int readCharCount;
			char[] cBuf = new char[3];
			String result = "";
			while (true) {
				readCharCount = reader.read(cBuf);
				if (readCharCount == -1)
					break;
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
