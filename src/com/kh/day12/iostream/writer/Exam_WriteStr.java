package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriteStr {
    public static void main(String [] args) {
    	
    	FileWriter writer = null;
    	
    	try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "오라클이 제일 쉬웠어요";
			writer.write(data);
			writer.flush(); //아직 버퍼 없어서 이거 안적어도 되긴 하는데 암튼 하는 버릇,, 
			System.out.println("꺄륵");
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
