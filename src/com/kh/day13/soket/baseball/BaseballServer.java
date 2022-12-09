package com.kh.day13.soket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		try {
			System.out.println("서버소켓을 생성했습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			//번호세개 뽑은 후에 게임 준비해야
			//중복제거해서 난수뽀ㅃ기
			Random rand = new Random();
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9)+1;
				for(int e = 0; e < i; e++) {
					if(numbers[e]==numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.println("서버숫자->" + numbers[0] + " "+numbers[1] + " "+numbers[2]);
			System.out.println("서버준비완료");
			////////////////////////////
			///값받기
			String readNum = dis.readUTF();
			System.out.println("받기 : " + readNum);
			//받은 값이 numbers 값이랑 비교했을때
			//숫자 맞고 위치 맞는지 =스트라잌
			//숫자 맞고 위치 틀렸는지 =볼
			//다틀림 = 00
			int strike = 0;
			int ball = 0;
			if numbers[i] = readNum
					
			
			System.out.println(strike + "스트라이크 " + ball + " 볼");		
					
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
