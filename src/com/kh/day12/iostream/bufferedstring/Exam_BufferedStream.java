package com.kh.day12.iostream.bufferedstring;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
    public static void main(String [] args) {
    	//버퍼크기 5, 표준출력스트림(System.out)과 연결한 버퍼출력스트림 생성 ⓐ
    	//C:\Users\\user1\Desktop\text2.txt파일 저장->영문텍스트 읽어->버퍼출력스트림 통해 출력
    	
    	//파일 입력용
    	FileReader fir = null;
    	int readChar;
    	try {
			fir = new FileReader("C:\\Users\\user1\\Desktop\\tamp\\kh.txt");
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5); //=ⓐ콘솔출력용
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
		    }
			new Scanner(System.in).nextLine();//다섯개씩 전부 읽고 마지막에 한개가 깍두기야
			bout.flush(); //다섯글자묶음으로 콘솔에 나오고 엔터치면 플러시 동작해서 나머지게 출력됨
			bout.close(); //여기선 flush 없어도 close가 그 역할을 해줌
			              //(코드가 여러개 더 있으면 클로즈=스트림닫기는 마지막에 한번만 하고 플러시로 비워)
    	}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    		
    	}
    	
    }

