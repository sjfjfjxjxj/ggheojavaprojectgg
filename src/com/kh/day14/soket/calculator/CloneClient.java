package com.kh.day14.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CloneClient {
	public static void main(String[] args) {
		Socket socket = null;
		String adress = "127.0.0.1";
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(adress, port);
			System.out.println("서버 연결완");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			while (true) {
				System.out.println("계산식: ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				if (input.equalsIgnoreCase("bye")) {
					System.out.println("종료하였습니다");
					break;
				}

				String output = dis.readUTF();
				System.out.println("계산결과: " + output);
				if (output.equalsIgnoreCase("end")) {
					System.out.println("잘못입력함. 다시 입력하라");
					continue;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
