package com.kh.day13.soket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Chatcl {
	public static void main(String[] arsg) {
		Socket socket = null;
		String adress = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("������");
			socket = new Socket(adress, port);
			System.out.println("���� ��");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("ä�ý���");
			
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.println("����(���)" + recvMsg);
				
				System.out.println("Ŭ��(��): ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
