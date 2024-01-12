package org.hong.day14.socket.calculator;

import java.io.*;
import java.net.*;

public class CalcServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다립니다...");
			Socket socket = serverSocket.accept();
			is = socket.getInputStream(); // 소켓에서 스트림을 가져와서 사용함.
			os = socket.getOutputStream();
			dis = new DataInputStream(is); // 보조스트림은 주스트림(is)을 전달값으로 넘겨줘야 함.
			dos = new DataOutputStream(os);
			System.out.println("클라이언트와 연결되었습니다.");
			while(true) {	
				String recvMsg = dis.readUTF();
				if("exit".equalsIgnoreCase(recvMsg)) {
					System.out.println("서버가 종료되었습니다!!");
					break;
				}
				System.out.println(recvMsg);
				String[] msgArrs = recvMsg.split(" "); // 띄어쓰기 기준으로 나눠서 배열로 변한
				if(msgArrs.length != 3) { // 입력한 값이 24 + 42 형태가 아닌 경우
					String result = "end";
					dos.writeUTF(result);
					continue;	// 밑에 코드를 실행하지 않은 반복을 다시 한다.
				}
				// 숫자로된 문자열을 계산하기 위해서 숫자로 바꿔주는데 Wrapper 클래스를 사용함
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch (operator) {
				case "+":
					result = Integer.toString(num1 + num2);
					break;
				case "-":
					result = Integer.toString(num1 - num2);
					break;
				case "*":
					result = Integer.toString(num1 * num2);
					break;
				case "/":
					result = Integer.toString(num1 / num2);
					break;
				case "%":
					result = Integer.toString(num1 % num2);
					break;
				}			
				dos.writeUTF(result);
				dos.flush();
			}
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
