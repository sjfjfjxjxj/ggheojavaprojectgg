package com.kh.day14.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CloneServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			System.out.println("서버구동중");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라 기다리는중");
			Socket socket = serverSocket.accept();
			System.out.println("서버 접속 완");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			while (true) {
				String recv = dis.readUTF();
				if (recv.equalsIgnoreCase("bye")) {
					System.out.println("클라 종료!");
					break;
				}

				System.out.println("받은 값 : " + recv);
				String[] recvs = recv.split(" ");
				if (recvs.length != 3) {
					recv = "end";
					dos.writeUTF(recv);
					continue;
				}
				int num1 = Integer.parseInt(recvs[0]);
				String operator = recvs[1];
				int num2 = Integer.parseInt(recvs[2]);
				String result = "";
				switch(operator) {
				case"+":
					result = num1 + num2 + " ";
					break;
				case"-":
					result = String.valueOf(num1 - num2);
					break;
				default: 
					result = "잘못입력함";
					break;
				
				}
				dos.writeUTF(result);
			}

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
