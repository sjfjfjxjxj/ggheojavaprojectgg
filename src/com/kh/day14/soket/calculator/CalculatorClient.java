package com.kh.day14.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		Socket socket = null;
		String adress = "127.0.0.1";
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(adress, port);
			System.out.println("서버 연결 완");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// 계산식(빈칸으로 띄어 입력(ex.24 + 42)
				// 계산결과: 46)
				System.out.print("계산식(빈칸으로 띄어 입력)>> ");
				String input = sc.nextLine();// 공백입력을 받아야해서 넥스트 아니고 넥스트라인
				dos.writeUTF(input);
				if(input.equalsIgnoreCase("bye")) {
			    System.out.println("종료하였습니다");
				break;
				}
				
				String output = dis.readUTF();
				System.out.println("계산결과: " + output);
				if(output.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 다시 입력해주세요.");
                    
					continue; //여기서부터 다시 위로 거슬러 올라가겠다
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
