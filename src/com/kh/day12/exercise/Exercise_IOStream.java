package com.kh.day12.exercise;

//��� ����̴� ��°�� �ܿ����ҵ�����
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
		// �̹������� ���� ->�оinput �����output
		// ���� �ƴϴϱ� byte��� ��/��� ��Ʈ��
		// C:\\Users\\user1\\Desktop\\omocnuni.png ->D:\\omocnuni.png �������(�������� �ΰ�)
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\Users\\user1\\Desktop\\omocnuni.png");
			os = new FileOutputStream("D:\\omocnuni.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
/* ������ */while ((readByteNo = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("�Űܶ�");
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
		 * ������ ���ϸ� �Է� : khtext.txt 'khtext.txt'' ���Ͽ� ����� ���� �Է� : ����� exit 1 : 1111 2 :
		 * text input 3 : good 4 : gogogo 5 : exit ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է�: ");
		String fileName = sc.next();

		Writer writer = null;

		try {
			writer = new FileWriter("src/iostream/" + fileName);
			System.out.println("'" + fileName + "'���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			sc.nextLine();// nextLne�� �� �̷��Ծ���
			int i = 1; // �̰� ���� ������ ���� 1: 1: ��� ����
			while (true) {// ���ѹݺ� : �����ؼ� ����ϰ� �Է¹ް� �����ϰ�
				System.out.print(i + ":");
				String input = sc.nextLine() + "\n"; // for�� ���� Ƚ�� ������ ���ܼ� �Է¹����� ��������
				// �ٶ������� �̷��� ��!! ���ڿ� ���Ҷ� ����
				// ~~����~~
				// if("exit" == input)break; �̰� ������ ����
				if ("exit\n".equals(input))
					break; // \n �Ⱥ��̰������ Ʈ���߶�
				// if("exit".equals(input.trim())) break;
				// if(input.equals("exit\n")) break; �̷��� �ص� �Ǵµ�
				// exit�� �տ����� �� ����: input�� ���� �ϰ� ����ġ�� null�� ���� ���ܹ߻��Ѵ�.
				// if("exit".contains(input)) break;�ȵ�->���������ϸ� ��
				// if("exit".contains(input.trim())) break; �̷���.
				// if("exit".contentEquals(input.trim()))break; ��
				writer.write(input);
				// writer.write(input+"\n"); �䷸�� �ص� �ǰ�
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
