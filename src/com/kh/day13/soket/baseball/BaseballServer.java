package com.kh.day13.soket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int[] numbers = new int[3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			System.out.println("서버소켓을 생성했습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			//System.out.println(new Date()); //서버시작시간ex. Mon Dec 12 10:27:37 KST 2022 출력됨
			//표기 바꾸고싶어: 심플데이트포맷!(위로 뺌_) 그런담▽
		    Date date = new Date();
		    System.out.println(trans.format(date));
			
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 번호세개 뽑은 후에 게임 준비해야
			// 중복제거해서 난수뽀ㅃ기

			Random rand = new Random();
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;
				for (int e = 0; e < i; e++) {
					if (numbers[e] == numbers[i]) {
						i--;// 중복제거
						break;// 하려면필수
					}
				}
			}
			System.out.println("서버숫자->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("서버준비완료");
			////////////////////////////

			while (true) {
				/// 값받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				// 받은 값이 numbers 값이랑 비교했을때
				// 숫자 맞고 위치 맞는지 =스트라잌
				// 숫자 맞고 위치 틀렸는지 =볼
				// 다틀림 = 00
				// numbers[]:서버가 준비한 값 세개int
				// readNum: 입력받은 값 세개 String
				// arrs[]: 입력받은 값 세개 배열로 바꿔서 저장
				/* char[] arrs = new char[3]; */
				int strike = 0; // numbers[i] = arrs[i]
				int ball = 0; // numbers[i] = arrs[i+1] || numbers[i] = arrs[i+2]
				/*
				 * 안됨ㅋㅋ 열심히 햇는데안됨ㅠ 당연함 for(int i = 0; i<readNum.length(); i++) { for(int j = 0;
				 * j<readNum.length(); j++) { arrs[i] = readNum.charAt(i);//arrs0, arrs1, arrs2
				 * 뽑혔다 if(numbers[i] == arrs[j]) { strike += strike; }else if(numbers[i] ==
				 * arrs[j]) { ball += ball; }//아 왜안뒈ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ } }
				 */
				String[] readNums = readNum.split(" "); // 띄어쓰기 기준으로 찢어주는 메소드래...
				// 입력받은 값을 숫자가 저장되는 배열로 변경:split()
				for (int i = 0; i < numbers.length; i++) {
					for (int e = 0; e < readNums.length; e++) {
						// Incompatible operand types int and String
						if (numbers[i] == Integer.parseInt(readNums[e])) {
							if (i == e) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				String result = strike + "스트라이크 " + ball + "볼";
				System.out.println(result);
				// 클라이언트로 결과값 보내주기
				dos.writeUTF(result);
				// 스트라이크 3이면 게임 종료하기
				if(strike == 3) {
					
					System.out.println("아웃! 게임종료");
					break;
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			//바이트기반 스트림이라 플러시 안눌러줘도됨...
			//몽땅 닫아줘야혀
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//Runtime Exception: 컴파일은 되는데 실행할때 오류나는,
	}//Throwable)))Exception))))IOException)))))UnknownException
}//부모 하나만 쓰면 캐치 여러개 안적어도 된다.(코드가 짧아짐)
//대신 예외별 메세지 출력 어려웡
