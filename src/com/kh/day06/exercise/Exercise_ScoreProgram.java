package com.kh.day06.exercise;
//���� �Է��ϴ� ���α׷� ����� ����
import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ESCAPE: //while�� ��ü �극��ũ �ܾ�(�ƹ��ų� ������)
	    while (true) {  //���ѹݺ�
			System.out.println("===== ���� �޴� =====");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			int korean = 0;
			int english = 0;
			int math = 0;
			int sum = 0;

			switch (choice) {
			case 1:
				System.out.println("=====�����Է�=====");
				System.out.print("����: ");
				korean = sc.nextInt();
				System.out.print("����: ");
				english = sc.nextInt();
				System.out.print("����: ");
				math = sc.nextInt();

				System.out.println("===== ���� �޴� =====");
				System.out.println("1. �����Է�");
				System.out.println("2. �������");
				System.out.println("3. ����");
				System.out.print("���� : ");
				sc.nextInt();
			case 2:
				sum = korean + english + math;
				System.out.println("==== ������� ====");
				System.out.println("����: " + korean);
				System.out.println("����: " + english);
				System.out.println("����: " + math);
				System.out.println("����: " + sum);
				System.out.printf("���: : %.2f\n", (double)sum / 3);
				break; // �Ҽ��� ���ڸ����� ǥ���ϱ�����!!!
			case 3:
				System.out.println("Good Bye~");
				break ESCAPE;
			default : 
				System.out.println("1 ~ 3 ������ ���ڸ� �Է��ϼ����Ф�");

			}
		}
	}

}

/*
 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 1
 * 
 * ====== ���� �Է� ======= ���� : 50 ���� : 40 ���� : 30
 * 
 * 
 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 2
 * 
 * ====== ���� ��� ====== ���� : 50 ���� : 40 ���� : 30
 * 
 * ���� : 120 ��� : 40.00
 * 
 * ====== ���� �޴� ======= 1. �����Է� 2. ������� 3. ���� ���� : 3
 * 
 * Good Bye~
 * 
 */
