package com.kh.day13.soket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	 public static void main(String [] args) {
	    	Socket socket = null;
	    	//String adress = "192.168.60.55";//내가 클라이언트일때 서버 컴퓨터 어드레스랑 포트 받아서 넣으면 채팅이 됨
	    	String adress = "127.0.0.1";
	    	int port = 8507;//개신기하다..근데 노트북은 노트북끼리만 된대(망이 달라)
		    InputStream is = null;
		    OutputStream os = null;
		    DataInputStream dis = null;
		    DataOutputStream dos = null;
		    Scanner sc = new Scanner(System.in);
		    
		    try {
		    	System.out.println("서버에 연결중입니다..");
				socket = new Socket(adress, port);
				System.out.println("채팅서버에 접속하였습니다.");
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				System.out.println("서버와의 채팅을 시작합니다.");
				
				while(true) {
					/////////받기1/////
//					byte [] buf = new byte[100];
//					int readNo = is.read(buf);
//					String recvMsg = new String(buf,0,readNo);
					String recvMsg = dis.readUTF();
					System.out.println("서버(상대): " + recvMsg);
					//////////////////
					
					///////보내기2////
					System.out.print("클라이언트(나): ");
					String sendMsg = sc.nextLine();
					dos.writeUTF(sendMsg);
//					buf = sendMsg.getBytes();
//					os.write(buf);
					//////////////////
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
