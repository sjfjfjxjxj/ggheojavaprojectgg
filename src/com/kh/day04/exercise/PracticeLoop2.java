package com.kh.day04.exercise;

import java.util.Scanner;

//	�� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� 
//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
//���� 1 �̸��� ���ڰ� �Էµƴٸ� 
//��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
//ex.1�̻��� ���ڸ� �Է��ϼ��� : 4 
//1 2 3 4
public class PracticeLoop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1���� ũ�ų� ���� ���� �ϳ��� �Է� :");
			int input = sc.nextInt();
			int output = 1;
			if (input > 0) {
				while (output <= input) {
					System.out.print(output++ + " ");
				}
			} else {
				System.out.println("1 �̻��� ���� �Է��ϼ���!!!");
			}
			System.out.println();
		}
	}
}
