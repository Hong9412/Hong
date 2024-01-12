package org.hong.day14.socket.chatting;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		ServerSocket sSocket = null;
		int port = 8889;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("채팅서버를 구동중입니다...");
			sSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = sSocket.accept();
			System.out.println("채팅서버를 구동하였습니다!");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다. (종료 : exit)");
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				///////////////////////////// 보내기 ///////////////////////
				dos.writeUTF(sendMsg);
				dos.flush();
				if("exit".equalsIgnoreCase(sendMsg)) {
					System.out.println("채팅프로그램을 종료합니다.");
					break;
				}
				///////////////////////////// 받기 ///////////////////////
				String recvMsg = dis.readUTF();
				if("exit".equalsIgnoreCase(recvMsg)) {
					System.out.println("상대가 채팅에서 나갔습니다.");
					break;
				}
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);				
			}
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