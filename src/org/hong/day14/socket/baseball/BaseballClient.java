package org.hong.day14.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			String recvMsg = dis.readUTF();
			System.out.println("게임 준비 완료");
			System.out.println("숫자 입력(띄어쓰기 구분) EX 1 2 3");
			while (true) {
				System.out.print(" --> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				if (recvMsg.equals(sendMsg)) {
					System.out.println("삼진 아웃!!!");
					break;
				}
				String resultMsg = dis.readUTF();
				if ("error".equalsIgnoreCase(resultMsg)) {
					System.out.println("다시 입력해주세요!");
				} else {
					System.out.println(resultMsg);
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
				dos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
