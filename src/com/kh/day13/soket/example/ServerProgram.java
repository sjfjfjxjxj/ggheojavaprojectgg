package com.kh.day13.soket.example;
//실행은 반드시 서버부터!
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
    public static void main(String [] args) {
    	ServerSocket serverSocket = null;
    	InputStream is = null; //데이터받기
    	OutputStream os = null; //데이터보내기
    	try {
    		System.out.println("연결 기다림..");//이거 실행할때 방화벽 팝업 뜨는데 엑세스 허용 ㄱ
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락됨!!");
			
			/////////데이터받기/////////ⓑ
			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공: "+ message);
			/////////////////////////////////////////////////
			
			////데이터보내기////////////////////////////////
			os = socket.getOutputStream();
			message = "Hello Client"; //보내려는 메세지
			bytes = message.getBytes(); //white 메소드 전달값: 바이트배열로 변환
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
			///////////////////////////////////////////////
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}














