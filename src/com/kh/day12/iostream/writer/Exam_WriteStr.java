package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriteStr {
    public static void main(String [] args) {
    	
    	FileWriter writer = null;
    	
    	try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "����Ŭ�� ���� �������";
			writer.write(data);
			writer.flush(); //���� ���� ��� �̰� ����� �Ǳ� �ϴµ� ��ư �ϴ� ����,, 
			System.out.println("����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
