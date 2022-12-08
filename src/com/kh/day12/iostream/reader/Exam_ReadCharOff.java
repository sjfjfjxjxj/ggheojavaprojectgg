package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
    public static void main(String [] args) {
    	Reader reader = null; //close 하기위한 변수 선언
    	
    	try {
			reader = new FileReader("src/iostream/filereader.txt");
			char [] cbuf = new char[3];
			reader.read(cbuf, 2, 1); //배열 세개짜리라 offset은 0,1,2로
			for(int i = 0; i < cbuf.length; i++) {
				System.out.print(cbuf[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    }
}
