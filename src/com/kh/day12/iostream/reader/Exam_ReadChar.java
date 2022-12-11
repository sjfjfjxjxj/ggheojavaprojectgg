package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
    public static void main(String[] args) {
    	Reader reader = null; 
    	
    	try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo; //������ ����
			char [] cbuf = new char[2];
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf); //�ڹ�:�α����ε� ���ڿ��̴ϱ�
				if(readCharNo == -1)break;
				data += new String(cbuf, 0, readCharNo);//��Ʈ������ �ٲ㼭
				//�� +�Ⱥ��̸� ���� �ȵż� �� �������� �����͸� ��µ�
			}
			//Unreachable code ���ѹݺ��ؼ� ����������->if break�� �ذ�
			System.out.println(data);
			reader.read(cbuf); //read�޼ҵ� �ι�°��(�迭)/cbuf:������
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close(); //���̳θ�����Ŭ���� ��������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
