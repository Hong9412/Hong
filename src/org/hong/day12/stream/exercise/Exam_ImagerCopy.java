package org.hong.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImagerCopy {
	public static void main(String[] args) {
		// C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg를
		// C:\\Temp\\copyimg.jpg 복사해보세요
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			byte [] readBytes = new byte[1024*10];
			int readByteCount;
			while((readByteCount = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteCount);
//				os.flush();	// 파이널리에 os.close쓰면 생략 가능!
							// 둘 중에 하나는 꼭 써야혀~!
			}
			System.out.println("복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
