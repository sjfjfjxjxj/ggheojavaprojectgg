package com.kh.day13.soket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
    public static void main(String [] args) {
    	Socket socket = null;
    	
    	OutputStream os = null; //��
    	InputStream is = null;
    	try {
			System.out.println("�����û");
    		socket = new Socket("127.0.0.1", 4885);//�� �ּ� ���ֱ�
			System.out.println("���Ἲ��!");
            ////////////������ ��������: ��½�Ʈ��////
			byte [] buf = null; //��
			String message = "";//��
			os = socket.getOutputStream();//��
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);//��
			os.flush();
			System.out.println("���������ۿϷ�");
			///////////////////////////
			
			///////////////�����͹ޱ�////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("�����͹ޱ� ���� : " + message);
			////////////////////////////
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    }
}
