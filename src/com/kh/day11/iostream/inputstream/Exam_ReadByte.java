package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
    public static void main(String [] args) {
    	InputStream is = null;
    	
    	try {
			is = new FileInputStream("src/iostream/inputStream.txt");//��ĳ���� ����
			int readByteNo; //�������Ʈ�� ��Ʈ������->�� ����ϸ� ���� Ƚ��(3)�� �����ϰٱ�
			byte [] readBytes = new byte[3]; //��������[] �а� �϶�! 
			String data = ""; //�����Ѱ� while�� �ۿ����� ����Ϸ��� ���� �ʱ�ȭ!
            while(true) {
            	readByteNo = is.read(readBytes); //�����ʹ� readBytes�� �־�
            	if(readByteNo==-1) break;
            	data += new String(readBytes, 0, readByteNo); //��Ʈ�� Ĵü ����������
    //���������ʹ� ���մ��Կ����ڷ�//String(�����Ͱ��ִ°�(�ּҰ�), ù��°�ε�����, �迭����)
            	
            }
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
