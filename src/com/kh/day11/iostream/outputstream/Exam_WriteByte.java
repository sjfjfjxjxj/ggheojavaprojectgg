package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {
    public static void main(String []args) {
    	OutputStream os = null;
    	
    	try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Real I/O".getBytes(); //☆포문이 사라졌다!! 배열 통째로 넣었다!!
			os.write(data); //for(){os.write(data[i])할필요가없음!
			os.flush();
			System.out.println("쓰기완료~~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
