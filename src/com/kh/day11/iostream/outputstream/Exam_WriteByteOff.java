package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
    public static void main(String [] args) {
    	OutputStream os = null;
    	
    	try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "JAVAscript".getBytes();
			os.write(data, 0, 4); //offset이랑 length로 조절해서 파일에 출력하고싶은거 조절ㅇㅇ
			os.flush();
			System.out.println("Write 완료!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
