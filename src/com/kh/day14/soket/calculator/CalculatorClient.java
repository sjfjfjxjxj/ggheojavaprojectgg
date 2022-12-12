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
			System.out.println("���� ���� ��");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// ����(��ĭ���� ��� �Է�(ex.24 + 42)
				// �����: 46)
				System.out.print("����(��ĭ���� ��� �Է�)>> ");
				String input = sc.nextLine();// �����Է��� �޾ƾ��ؼ� �ؽ�Ʈ �ƴϰ� �ؽ�Ʈ����
				dos.writeUTF(input);
				if(input.equalsIgnoreCase("bye")) {
			    System.out.println("�����Ͽ����ϴ�");
				break;
				}
				
				String output = dis.readUTF();
				System.out.println("�����: " + output);
				if(output.equalsIgnoreCase("end")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. ���Ŀ� �°� �ٽ� �Է����ּ���.");
                    
					continue; //���⼭���� �ٽ� ���� �Ž��� �ö󰡰ڴ�
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
