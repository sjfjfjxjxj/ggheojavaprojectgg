package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
    public static void main(String [] args) {
    	InputStream is = null;//InputStream은 추상메소드->객체 생성 못해서 널값넣음
    	
    	                           //↓checked exception 트라이캐치必! 
    	//Unhandled exception type FileNotFoundException↓
    	try {
			is = new FileInputStream("src/iostream/inputStream.txt"); //↑쓸려면 = 객체생성하려면 = 생성자를 호출하려면
			                         //↑경로 써줌: src에 있는 / txt파일
			                        //경로안써줄라면 프로젝트 바로 아래 파일이 있어야함
			int readByte; //리드메소드 반환형이 int라 변수 하나 선언함
			while(true) {
				readByte = is.read();
				//없으면(:-1) 그만 읽어야해
				if(readByte == -1) break;
				System.out.print(readByte);//이프브레이크 없으면 -1이 무한반복됨ㅇㅇ
			}
//			for(int i = 0; i <4; i++) {
//				readByte = is.read();//포문 없으면 맨 앞에 글자만 읽음
//				System.out.print((char)readByte); //형변환 안하면 아스킼코드값으로 나옴(65666768)
//			} 글자수에 따라서 코드를 계속 바까줘야하는 나쁜 코드x_x
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
