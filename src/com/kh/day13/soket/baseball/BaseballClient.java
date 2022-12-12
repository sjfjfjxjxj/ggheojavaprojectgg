package com.kh.day13.soket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("게임준비완료");

			while (true) {
				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				///////////////////
				String resultMsg = dis.readUTF();
				System.out.println(resultMsg);// 콘솔창에 보이는 것
				if(resultMsg.startsWith("3")) { //메세지가 3으로 시작하면!
					System.out.println("~GAME CLEAR |||| YOU WIN~");
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
