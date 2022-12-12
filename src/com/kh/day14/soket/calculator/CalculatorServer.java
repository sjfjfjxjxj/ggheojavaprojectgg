package com.kh.day14.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			System.out.println("서버 구동중!");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라 기다리는 중!");
			Socket socket = serverSocket.accept();
			System.out.println("클라 접속 완");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// 받은 메시지 : 24 + 42
				// 연산 결과 보내기
				String recv = dis.readUTF();
				if(recv.equalsIgnoreCase("bye")) {  //대소문자 구분 없이!
				//java.net.SocketException: Connection reset 클라에서 못받아서
				System.out.println("클라 종료!");
				break;
				}
				
				System.out.println("받은 값: " + recv);
				String[] recvs = recv.split(" ");
				if(recvs.length != 3) {
					recv = "end";
					//recv = "잘못 입력하셨습니다. 형식에 맞게 다시 입력해주세요.";
					dos.writeUTF(recv);
					System.out.println(recv);
					continue;//브레이크 대신 이거 쓰면 멈추지 않고 다시 와일문으로 거슬러감
					
				}
				// 힝입니다...Integer.parsInt(result) = recvs[0]+recvs[1]+recvs[2];
				int num1 = Integer.parseInt(recvs[0]);
				String operator = recvs[1];
				int num2 = Integer.parseInt(recvs[2]);
				String result = "";
				switch (operator) {
				case "+": // int를 String으로 바꿔야하는데,
					result = num1 + num2 + "";// ⓐ모든결과값+문자열=문자열이 됨
					break;
				case "-":
					result = String.valueOf(num1 - num2);// ⓑ이렇게도!
					break;
				case "*":
					result = String.valueOf(num1 * num2);
					break;
				case "/":
					result = String.valueOf(num1 / num2);
					break;
				case "%":
					result = String.valueOf(num1 % num2);
					break;
				default:
					result = "연산자를 잘못 입력했어요.";
					break;
				}
				dos.writeUTF(result);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
