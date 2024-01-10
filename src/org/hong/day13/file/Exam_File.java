package org.hong.day13.file;

import java.io.*; // 하나로 퉁췸스~
// SELECT * FROM EMPLOYEE;

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\copyimg.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n", fileName, path, parent);
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? :%b\n폴더가 맞는가? : %b\n"
				, file.exists()
				, file.isFile()
				, file.isDirectory());
		
		Exam_File exFile = new Exam_File();
		exFile.folderMake();
		exFile.fileMake();
	}

	public void folderMake() {
		File folderMake = new File("src/org/hong/day13/file/d-day.txt");
		if (!folderMake.exists()) {
			folderMake.mkdir(); // 폴다 만듬
			System.out.println("폴더가 만들어졌습니다~");
		} else {
			System.out.println("이미 폴더가 존재합니다.");
		}
	}

	public void fileMake() {
		try {
			File fileMake = new File("src/org/hong/day13/file/dday.txt");
			if (!fileMake.exists()) {
				fileMake.createNewFile();
				System.out.println("파일이 만들어졌습니다!");
			} else {
				System.out.println("이미 파일이 존재합니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
