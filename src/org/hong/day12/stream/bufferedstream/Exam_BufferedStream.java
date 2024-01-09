package org.hong.day12.stream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		FileReader fir = null;
		int readCharCount;
		BufferedOutputStream bOut = new BufferedOutputStream(System.out, 1024);
		try {
			fir = new FileReader("src/org/hong/day12/stream/exercise/Exam_TextFileCopy.java");
			while((readCharCount = fir.read()) != -1) {
				bOut.write(readCharCount);
			}
			bOut.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bOut.close();
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
