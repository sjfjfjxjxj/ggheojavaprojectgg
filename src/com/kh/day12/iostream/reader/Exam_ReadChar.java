package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
    public static void main(String[] args) {
    	Reader reader = null; 
    	
    	try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo; //읽은거 갯수
			char [] cbuf = new char[2];
			String data = "";
			while(true) {
				readCharNo = reader.read(cbuf); //자바:두글자인데 문자열이니까
				if(readCharNo == -1)break;
				data += new String(cbuf, 0, readCharNo);//스트링으로 바꿔서
				//↑ +안붙이면 누적 안돼서 맨 마지막에 읽은것만 출력됨
			}
			//Unreachable code 무한반복해서 닿을수없당->if break로 해결
			System.out.println(data);
			reader.read(cbuf); //read메소드 두번째거(배열)/cbuf:읽은것
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close(); //파이널리리드클로즈 잊지말기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
