package org.hong.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		// C드라이브에 있는 파일을 E드라이브로 복사해보자
		// C:\\Users\\user1\\Pictures/Felite.png : 복사하고 싶은 파일
		// D:\\Fclass_icon.png : 복사하고 싶은 위치(파일이름) (출력)
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user1\\Pictures/Felite.png");
			os = new FileOutputStream("D:\\tempworkspace\\Fclass_icon.png");
			byte [] readBytes = new byte[1024];
			int readByteCount;
			while((readByteCount = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteCount);
//				os.flush();
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
