package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
    public static void main(String [] args) {
    	InputStream is = null;
    	
    	try {
			is = new FileInputStream("src/iostream/inputStream.txt");//업캐스팅 상태
			int readByteNo; //리드바이트도 인트변수라서->얠 출력하면 읽은 횟수(3)를 리턴하겟군
			byte [] readBytes = new byte[3]; //여러개씩[] 읽게 하라! 
			String data = ""; //누적한걸 while문 밖에서도 사용하려면 선언 초기화!
            while(true) {
            	readByteNo = is.read(readBytes); //데이터는 readBytes에 있어
            	if(readByteNo==-1) break;
            	data += new String(readBytes, 0, readByteNo); //스트링 캑체 만들어줘야해
    //누적데이터는 복합대입연산자로//String(데이터가있는곳(주소값), 첫번째인덱스값, 배열길이)
            	
            }
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
