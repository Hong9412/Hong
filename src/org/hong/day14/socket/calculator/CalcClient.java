package org.hong.day14.socket.calculator;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;	// 바이트 기반 스트림
		InputStream is = null;
		DataOutputStream dos = null; // 보조스트림을 이용해서 데이터 전송을 편리하게 함
		DataInputStream dis = null;
		try {
			System.out.println("서버에 연결중입니다...");
			Socket socket = new Socket(address, port);	// 서버에 연결을 시도~
			os = socket.getOutputStream(); // 소켓에서 스트림을 가져와서 사용함.
			is = socket.getInputStream();
			dos = new DataOutputStream(os); // 보조스트은 주스트림(os)을 전달값으로 넘겨줘야 함.
			dis = new DataInputStream(is);
			System.out.println("서버와 연결되었습니다!");
			System.out.println();
			while(true) {
				System.out.printf("계산식(빈칸으로 띄어 입력, 예 24 + 42) 종료(exit) >> ");
				String sendMsg = sc.nextLine();	// 18번째 이후에도 입력한 값을 사용할 수 있도록 변수에 저장
				dos.writeUTF(sendMsg); // 보조스트림을 쓰니까 좀 더 편하게 데이터 전송가능
				dos.flush();
				if(sendMsg.equals("exit")) {
					System.out.println("프로그램이 종료되었습니다!");
					break;
				}
				
				// 서버에서 보낸 값 받기
				String result = dis.readUTF();
				if("end".equalsIgnoreCase(result)) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				System.out.println("계산결괴스~ : " + result);
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
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					is.close();
					os.close();
					dos.close();
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
