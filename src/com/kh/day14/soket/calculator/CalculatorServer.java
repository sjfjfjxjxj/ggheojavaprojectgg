package com.kh.day14.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8989;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			System.out.println("���� ������!");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ�� ��ٸ��� ��!");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ�� ���� ��");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// ���� �޽��� : 24 + 42
				// ���� ��� ������
				String recv = dis.readUTF();
				if(recv.equalsIgnoreCase("bye")) {  //��ҹ��� ���� ����!
				//java.net.SocketException: Connection reset Ŭ�󿡼� ���޾Ƽ�
				System.out.println("Ŭ�� ����!");
				break;
				}
				
				System.out.println("���� ��: " + recv);
				String[] recvs = recv.split(" ");
				if(recvs.length != 3) {
					recv = "end";
					//recv = "�߸� �Է��ϼ̽��ϴ�. ���Ŀ� �°� �ٽ� �Է����ּ���.";
					dos.writeUTF(recv);
					System.out.println(recv);
					continue;//�극��ũ ��� �̰� ���� ������ �ʰ� �ٽ� ���Ϲ����� �Ž�����
					
				}
				// ���Դϴ�...Integer.parsInt(result) = recvs[0]+recvs[1]+recvs[2];
				int num1 = Integer.parseInt(recvs[0]);
				String operator = recvs[1];
				int num2 = Integer.parseInt(recvs[2]);
				String result = "";
				switch (operator) {
				case "+": // int�� String���� �ٲ���ϴµ�,
					result = num1 + num2 + "";// �͸������+���ڿ�=���ڿ��� ��
					break;
				case "-":
					result = String.valueOf(num1 - num2);// ���̷��Ե�!
					break;
				case "*":
					result = String.valueOf(num1 * num2);
					break;
				case "/":
					result = String.valueOf(num1 / num2);
					break;
				case "%":
					result = String.valueOf(num1 % num2);
					break;
				default:
					result = "�����ڸ� �߸� �Է��߾��.";
					break;
				}
				dos.writeUTF(result);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
