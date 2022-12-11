package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
    public static void main(String [] args) {
    	OutputStream os = null;
    	
    	try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Hello I/O".getBytes() ; //""안에있는앨 txt에 넣고싶어->바이트배열로 바꿔
			for(int i = 0; i < data.length; i++) { //getBytes():아스키코드값으로 바꿈
				os.write(data[i]);
			}
			os.flush(); //버퍼 공간 비워주기
			System.out.println("쓰기완료!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
