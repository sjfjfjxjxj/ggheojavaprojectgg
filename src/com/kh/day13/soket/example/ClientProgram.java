package com.kh.day13.soket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
    public static void main(String [] args) {
    	Socket socket = null;
    	
    	OutputStream os = null; //ⓓ
    	InputStream is = null;
    	try {
			System.out.println("연결요청");
    		socket = new Socket("127.0.0.1", 4885);//내 주소 써주기
			System.out.println("연결성공!");
            ////////////데이터 보내야해: 출력스트림////
			byte [] buf = null; //ⓖ
			String message = "";//ⓘ
			os = socket.getOutputStream();//ⓔ
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);//ⓗ
			os.flush();
			System.out.println("데이터전송완료");
			///////////////////////////
			
			///////////////데이터받기////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터받기 성공 : " + message);
			////////////////////////////
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }
}
