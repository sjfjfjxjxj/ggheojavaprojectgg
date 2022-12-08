package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
    public static void main(String [] args) {
    	Writer writer = null;
    	
    	try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] cbuf = "자바 어려워요".toCharArray();
			writer.write(cbuf); //배열로 안넣고 스트링으로 해도 된당(다음 exam ㄱ)
			writer.flush();
			System.out.println("동작하라");
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
