package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

//���� �յ� ������
public class Exercise_Random1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		for (;;) {
			System.out.println("=====���� �� �� ������=====");
			System.out.print("���ڸ� �Է����ּ���(1.�ո�/2.�޸�) : ");
			int choice = sc.nextInt();
			// computer �������� 1 �Ǵ� 2�� ���� �����ϰ� ������
			int computer = rand.nextInt(2) + 1;
			System.out.println("��ǻ�� : " + computer);
			// choice�� ���� computer ���� ������ �������ϴ�. �ٸ��� Ʋ�Ƚ��ϴ�.
			if (choice == computer) {
				System.out.println("�������ϴ�!");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�!");
			}
		}
	}
}
