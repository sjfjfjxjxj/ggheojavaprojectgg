package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
    public static void main(String [] args) {
    	InputStream is = null;//InputStream�� �߻�޼ҵ�->��ü ���� ���ؼ� �ΰ�����
    	
    	                           //��checked exception Ʈ����ĳġ��! 
    	//Unhandled exception type FileNotFoundException��
    	try {
			is = new FileInputStream("src/iostream/inputStream.txt"); //�辵���� = ��ü�����Ϸ��� = �����ڸ� ȣ���Ϸ���
			                         //���� ����: src�� �ִ� / txt����
			                        //��ξȽ��ٶ�� ������Ʈ �ٷ� �Ʒ� ������ �־����
			int readByte; //����޼ҵ� ��ȯ���� int�� ���� �ϳ� ������
			while(true) {
				readByte = is.read();
				//������(:-1) �׸� �о����
				if(readByte == -1) break;
				System.out.print(readByte);//�����극��ũ ������ -1�� ���ѹݺ��ʤ���
			}
//			for(int i = 0; i <4; i++) {
//				readByte = is.read();//���� ������ �� �տ� ���ڸ� ����
//				System.out.print((char)readByte); //����ȯ ���ϸ� �ƽ��f�ڵ尪���� ����(65666768)
//			} ���ڼ��� ���� �ڵ带 ��� �ٱ�����ϴ� ���� �ڵ�x_x
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
