package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
    public static void main(String [] args) {
    	Writer writer = null;
    	
    	try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] cbuf = "�ڹ� �������".toCharArray();
			writer.write(cbuf); //�迭�� �ȳְ� ��Ʈ������ �ص� �ȴ�(���� exam ��)
			writer.flush();
			System.out.println("�����϶�");
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
