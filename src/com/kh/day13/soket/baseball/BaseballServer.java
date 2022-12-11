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
			System.out.println("���������� �����߽��ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			//��ȣ���� ���� �Ŀ� ���� �غ��ؾ�
			//�ߺ������ؼ� �����Ǥ���
			
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
			System.out.println("��������->" + numbers[0] + " "+numbers[1] + " "+numbers[2]);
			System.out.println("�����غ�Ϸ�");
			////////////////////////////
			///���ޱ�
			String readNum = dis.readUTF();
			System.out.println("�ޱ� : " + readNum);
			//���� ���� numbers ���̶� ��������
			//���� �°� ��ġ �´��� =��Ʈ���
			//���� �°� ��ġ Ʋ�ȴ��� =��
			//��Ʋ�� = 00
			//numbers[]:������ �غ��� �� ����
			//readNum: �Է¹��� �� ���� 
			//arrs[]: �Է¹��� �� ���� �迭�� �ٲ㼭 ����
			char[] arrs = new char[3];	
			int strike = 0; //numbers[i] = arrs[i]
			int ball = 0; // numbers[i] = arrs[i+1] || numbers[i] = arrs[i+2]
			for(int i = 0; i<readNum.length(); i++) {
				for(int j = 0; j<readNum.length(); j++) {
					arrs[i] = readNum.charAt(i);//arrs0, arrs1, arrs2 ������
					if(numbers[i] == arrs[i]) {
						strike += strike;
					}else if(numbers[i] == numbers[j]) {
						ball += ball;
					}//�� �־ȵؤФФФФФФФФФ�
				}
			} 
			System.out.print(strike + "��Ʈ����ũ " + ball + " ��");		
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
