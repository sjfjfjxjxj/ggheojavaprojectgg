package home.home.noupdate;

import java.util.Scanner;

public class StudentFunction {
	Scanner sc;

	int choice = 0;
	int kor = 0;
	int math = 0;
	public int printMenu() {
		System.out.println("--���θ޴�--");
		System.out.println("1.�����Է�");
		System.out.println("2.�������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		choice = sc.nextInt();
		return choice;

	};

	public void inputScore() {
		System.out.println("--�����Է�--");
		System.out.println("���� : ");
		int kor = sc.nextInt();
		System.out.println("���� : ");
		int math = sc.nextInt();
	}
	
	public void printScore() {
		System.out.print("--�������--");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
	}
}









