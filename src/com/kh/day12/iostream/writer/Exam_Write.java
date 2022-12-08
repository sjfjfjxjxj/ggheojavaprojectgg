package com.kh.day12.iostream.writer;
//그냥 문법을 외우자.... 흑흑 어떠케 외우지
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
    public static void main(String [] args) {
    	Writer writer = null;
    	
    	try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char [] data = "스프링&클라우드 웹개발자 양성과정".toCharArray();//이 메소드가 문자배열로 만들어줌
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush(); //버퍼에 데이터가 안쌓여있어도 다 내보냄
			System.out.println("쓰기 完");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    }
}
