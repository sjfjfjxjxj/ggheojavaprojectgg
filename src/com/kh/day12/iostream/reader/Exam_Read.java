package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
    public static void main(String [] args) {
    	// ����Ʈ ��� ��Ʈ��(day11)<-����Ʈ������ �о ����������
    	InputStream is = null;
    	//���� ��� ��Ʈ��<-���ڴ������� �ȱ���
    	Reader reader = null;
    	try {                             //Reader�� �ѱ۷� �� ���ϵ� �� �о�´�
    		reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read(); //�д°� ����--->�����Ͱ� ����������
				if(readData == -1)break;
				System.out.print((char)readData); //��� ���� 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} finally {//�ݵ�� ����� �� �ϴ� �ڵ�(��δ� ���ܹ߻� ���ζ� ������� ������ �������ϹǷ�)
			try {
				reader.close();//close�޼ҵ�� �߻�޼ҵ�. ����-���α׷� ����(��Ʈ��)�� �ݾ������
				//�׷��� reader�� ������������ ��! ���������� try �ۿ� �����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
    	
    }
}
