package com.kh.day13.soket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chatserv {
    public static void main(String[] arsg) {
    	ServerSocket serverSocket = null;
    	int port = 8888;
    	InputStream is = null;
    	OutputStream os = null;
    	DataInputStream dis = null;
    	DataOutputStream dos = null;
    	Scanner sc = new Scanner(System.in);
    	
    	try {
    		System.out.println("������");
    		Thread.sleep(2000);
    		System.out.println("������");
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ�� ���� ��ٸ�����");
			Thread.sleep(2000);
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ�� ���� ��");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("ä�ý���");
			
			while(true) {
				System.out.println("����(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				
				String recvMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ(���) : " + recvMsg);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    }
}
