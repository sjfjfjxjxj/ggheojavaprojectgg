package com.kh.day12.exercise;

//우왕 대박이다 통째로 외워야할듯ㅋㅋㅋ
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy() {
		// 이미지파일 복사 ->읽어서input 만들기output
		// 문자 아니니까 byte기반 입/출력 스트림
		// C:\\Users\\user1\\Desktop\\omocnuni.png ->D:\\omocnuni.png 폴더경로(역슬래시 두개)
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\Users\\user1\\Desktop\\omocnuni.png");
			os = new FileOutputStream("D:\\omocnuni.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
/* 파일읽 */while ((readByteNo = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("옮겨라");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void memoFileMake() {
		/*
		 * 저장할 파일명 입력 : khtext.txt 'khtext.txt'' 파일에 저장될 내용 입력 : 종료는 exit 1 : 1111 2 :
		 * text input 3 : good 4 : gogogo 5 : exit 파일 저장 완료 (exit는 제외하고 저장)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력: ");
		String fileName = sc.next();

		Writer writer = null;

		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			sc.nextLine();// nextLne은 꼭 이렇게쓰기
			int i = 1; // 이게 와일 안으로 들어가면 1: 1: 계속 나옴
			while (true) {// 무한반복 : 증가해서 출력하고 입력받고 저장하고
				System.out.print(i + ":");
				String input = sc.nextLine() + "\n"; // for문 쓰면 횟수 제한이 생겨서 입력받을땐 좋지않음
				// 줄띄고시을때 이렇게 써!! 문자열 비교할때 주의
				// ~~종료~~
				// if("exit" == input)break; 이건 동작을 안혀
				if ("exit\n".equals(input))
					break; // \n 안붙이고싶으면 트림잘라
				// if("exit".equals(input.trim())) break;
				// if(input.equals("exit\n")) break; 이렇게 해도 되는데
				// exit가 앞에오면 더 좋대: input에 띄어쓰기 하고 엔터치면 null값 들어가서 예외발생한대.
				// if("exit".contains(input)) break;안됨->공백제거하면 됨
				// if("exit".contains(input.trim())) break; 이렇게.
				// if("exit".contentEquals(input.trim()))break; 됨
				writer.write(input);
				// writer.write(input+"\n"); 요렇게 해도 되고
				i++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
