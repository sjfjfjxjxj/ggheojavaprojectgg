package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// �ΰ� ���� �Է¹ް� ������ �Է¹޾� ����ϴ� ���α׷� �ۼ�!
		// ���� �ϳ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� :");
		int num1 = sc.nextInt();
		System.out.print("������ �ѹ� �� �Է��� �ּ��� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է��� �ּ���(+,-,*,/,%) : ");
		char cal = sc.next().charAt(0);
		int result = 0;
		if (cal == '+') {
			result = num1 + num2;
		} else if (cal == '-') {
			result = num1 - num2;
		} else if (cal == '*') {
			result = num1 * num2;
		} else if (cal == '/') {
			result = num1 / num2;
		} else {
			result = num1 % num2;
		}
		System.out.print("��� : " + num1 + " " + cal + " " + num2 + " = " + result);

	}
}
