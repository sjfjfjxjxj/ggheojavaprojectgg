package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
    public static void main(String [] args) {
    	// 바이트 기반 스트림(day11)<-바이트단위로 읽어서 깨질수ㅇㅇ
    	InputStream is = null;
    	//문자 기반 스트림<-문자단위ㅇㅇ 안깨짐
    	Reader reader = null;
    	try {                             //Reader는 한글로 된 파일도 잘 읽어온다
    		reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read(); //읽는거 무한--->데이터가 없을때까지
				if(readData == -1)break;
				System.out.print((char)readData); //출력 무한 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} finally {//반드시 실행돼 야 하는 코드(통로는 예외발생 여부랑 상관없이 무조건 닫혀야하므로)
			try {
				reader.close();//close메소드는 추상메소드. 파일-프로그램 연결(스트림)을 닫아줘야함
				//그래서 reader는 전역변수여야 해! 변수선언을 try 밖에 해줘야
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
    	
    }
}
