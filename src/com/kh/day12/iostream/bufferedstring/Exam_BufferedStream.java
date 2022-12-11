package com.kh.day12.iostream.bufferedstring;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
    public static void main(String [] args) {
    	//����ũ�� 5, ǥ����½�Ʈ��(System.out)�� ������ ������½�Ʈ�� ���� ��
    	//C:\Users\\user1\Desktop\text2.txt���� ����->�����ؽ�Ʈ �о�->������½�Ʈ�� ���� ���
    	
    	//���� �Է¿�
    	FileReader fir = null;
    	int readChar;
    	try {
			fir = new FileReader("C:\\Users\\user1\\Desktop\\tamp\\kh.txt");
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5); //=���ܼ���¿�
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
		    }
			new Scanner(System.in).nextLine();//�ټ����� ���� �а� �������� �Ѱ��� ��α��
			bout.flush(); //�ټ����ڹ������� �ֿܼ� ������ ����ġ�� �÷��� �����ؼ� �������� ��µ�
			bout.close(); //���⼱ flush ��� close�� �� ������ ����
			              //(�ڵ尡 ������ �� ������ Ŭ����=��Ʈ���ݱ�� �������� �ѹ��� �ϰ� �÷��÷� ���)
    	}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    		
    	}
    	
    }

