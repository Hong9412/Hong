package org.hong.day14.socket.chatting;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		String address = "192.168.60.2";
		int port = 8891;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("서버에 연결중입니다");
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다. (종료 : exit)");
			// 서버에 보내고 있으니 받아야 됨!!!
			while(true) {		
				String recvMsg = dis.readUTF();
				if("exit".equalsIgnoreCase(recvMsg)) {
					System.out.println("상대가 채팅에서 나갔습니다.");
					break;
				}
				System.out.printf("서버(상대) : %s\n", recvMsg);
				//////////////////// 보내기 /////////////////////
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equalsIgnoreCase(sendMsg)) {
					System.out.println("프로그램을 종료합니다.");
					break;
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
