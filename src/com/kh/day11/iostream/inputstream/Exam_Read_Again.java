package com.kh.day11.iostream.inputstream;
//야 이거 너무 어렵다.... 어려부얼어렁ㅁㄹㅇ러롬
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read_Again {
    public static void main(String[] args) {
    	InputStream is = null;
    	try {
			is = new FileInputStream("src/inputStream.txt");
            for(int i = 0; i < 4; i++) {
            	int readByte = is.read();
            	System.out.println((char)readByte);
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
    	
    }
	
}
