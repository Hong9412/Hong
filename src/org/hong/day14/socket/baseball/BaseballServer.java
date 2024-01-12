package org.hong.day14.socket.baseball;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket sSocket = null;
		int port = 8888;
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			sSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = sSocket.accept();
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("클라이언트가 접속했습니다.");
			System.out.println("게임 준비 완료");
			System.out.println("숫자 입력(띄어쓰기 구분) EX 1 2 3");
			System.out.print("서버 숫자 => ");

			int sArrs[] = new int[3];
			for (int i = 0; i < 3; i++) {
				sArrs[i] = rand.nextInt(9) + 1;
				for (int j = 0; j < i; j++) {
					if (sArrs[i] == sArrs[j]) {
						// i는 0 1 2
						// i가 1이어야지 2번째값을 뽑는 것
						// 뽑은 값이 같았는데 i의 값을 그대로 두면
						// 바깥 반복문을 만나서 i++가 되어 2번째 값을
						// 뽑지 않으므려 i는 -1을 해주어야 다시 2번째
						// 값을 뽑게 됨.

						// i = 0이면 skip
						// i = 1이면 1번 반복
						// i = 2이면 2번 반복
						i--;
						break;
					}
				}
			}
			String sendMsg = sArrs[0] + " " + sArrs[1] + " " + sArrs[2];
			System.out.println(sendMsg);
			////////////////////// 보내기 ////////////////////
			dos.writeUTF(sendMsg);
			dos.flush();
			///////////////////// 받기 //////////////////////
			while (true) {
				String recvMsg = dis.readUTF();
				String cN[] = recvMsg.split(" ");
				if (cN.length != 3) {
					String errMsg = "error";
					dos.writeUTF(errMsg);
					dos.flush();
					continue;
				}
				int strike = 0;
				int ball = 0;
				int cN1 = Integer.parseInt(cN[0]);
				int cN2 = Integer.parseInt(cN[1]);
				int cN3 = Integer.parseInt(cN[2]);
				int cArrs[] = { cN1, cN2, cN3 };

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (sArrs[i] == cArrs[j]) {
							ball++;
						}
					}
				}
				for (int i = 0; i < 3; i++) {
					if (sArrs[i] == cArrs[i]) {
						ball--;
						strike++;
					}
				}

				String result = "스트라이크 : " + strike + " 볼 : " + ball;
//				if(recvMsg.equals(sendMsg)) {
//					System.out.println("삼진 아웃스~");
//				}
				dos.writeUTF(result);
				dos.flush();
				System.out.println("받기 : " + recvMsg);
				if (strike == 3) {
					System.out.println("삼진 아웃!!");
					break;
				}
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
