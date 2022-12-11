package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream_IMGCOPY_Again {
	public void fileCP(){
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user1\\Desktop\\ddatmouse.png");
			os = new FileOutputStream("D:\\ddatmouse.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���Դϴ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void memoFileMakeC() {
		/*
		 * ������ ���ϸ� �Է� : c.txt -> ���Ͽ� ����� ���� �Է� : 
		 * ����� exit 
		 * 1 : 1111 
		 * 2 : 2222
		 * 3 : exit ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ϸ�: ");
		String fileName = sc.next();
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println(fileName + "���Ͽ� ����� ���� : ");
			System.out.println("����� exit");
			sc.nextLine();
			int i = 1;
			while(true) {
				System.out.println(i + ":");
				String input = sc.nextLine()+"\n";
				if("exit".equals(input.trim())) break;
				writer.write(input);
				i++;
			}
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









