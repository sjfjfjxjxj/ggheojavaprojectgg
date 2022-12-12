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
			System.out.println("���������� �����߽��ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			//System.out.println(new Date()); //�������۽ð�ex. Mon Dec 12 10:27:37 KST 2022 ��µ�
			//ǥ�� �ٲٰ�;�: ���õ���Ʈ����!(���� ��_) �׷����
		    Date date = new Date();
		    System.out.println(trans.format(date));
			
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// ��ȣ���� ���� �Ŀ� ���� �غ��ؾ�
			// �ߺ������ؼ� �����Ǥ���

			Random rand = new Random();
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;
				for (int e = 0; e < i; e++) {
					if (numbers[e] == numbers[i]) {
						i--;// �ߺ�����
						break;// �Ϸ����ʼ�
					}
				}
			}
			System.out.println("��������->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("�����غ�Ϸ�");
			////////////////////////////

			while (true) {
				/// ���ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				// ���� ���� numbers ���̶� ��������
				// ���� �°� ��ġ �´��� =��Ʈ���
				// ���� �°� ��ġ Ʋ�ȴ��� =��
				// ��Ʋ�� = 00
				// numbers[]:������ �غ��� �� ����int
				// readNum: �Է¹��� �� ���� String
				// arrs[]: �Է¹��� �� ���� �迭�� �ٲ㼭 ����
				/* char[] arrs = new char[3]; */
				int strike = 0; // numbers[i] = arrs[i]
				int ball = 0; // numbers[i] = arrs[i+1] || numbers[i] = arrs[i+2]
				/*
				 * �ȵʤ��� ������ �޴µ��ȵʤ� �翬�� for(int i = 0; i<readNum.length(); i++) { for(int j = 0;
				 * j<readNum.length(); j++) { arrs[i] = readNum.charAt(i);//arrs0, arrs1, arrs2
				 * ������ if(numbers[i] == arrs[j]) { strike += strike; }else if(numbers[i] ==
				 * arrs[j]) { ball += ball; }//�� �־ȵؤФФФФФФФФФ� } }
				 */
				String[] readNums = readNum.split(" "); // ���� �������� �����ִ� �޼ҵ巡...
				// �Է¹��� ���� ���ڰ� ����Ǵ� �迭�� ����:split()
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
				String result = strike + "��Ʈ����ũ " + ball + "��";
				System.out.println(result);
				// Ŭ���̾�Ʈ�� ����� �����ֱ�
				dos.writeUTF(result);
				// ��Ʈ����ũ 3�̸� ���� �����ϱ�
				if(strike == 3) {
					
					System.out.println("�ƿ�! ��������");
					break;
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			//����Ʈ��� ��Ʈ���̶� �÷��� �ȴ����൵��...
			//���� �ݾ������
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//Runtime Exception: �������� �Ǵµ� �����Ҷ� ��������,
	}//Throwable)))Exception))))IOException)))))UnknownException
}//�θ� �ϳ��� ���� ĳġ ������ ����� �ȴ�.(�ڵ尡 ª����)
//��� ���ܺ� �޼��� ��� �����
