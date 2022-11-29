package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
		// ������=1+2+3+4+...+n
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1���� 10������ �� : " + sum);
	}

	public void exercise2() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			System.out.println(sum);
		}
	}

	public void exercise3() {
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}
	public void exercise4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 ������ ����� �Է��ϼ��� : ");
		int number = sc.nextInt(); // number �������� ����
		if ((number <= 9) && (number >= 1)) {
			for (int i = 1; i <= 9; i++) { //i �������� ����
				System.out.println(number + " * " + i + " = " + number * i);
			}
		} else {
			System.out.println("1~9 ������ ����� �ƴ��ݾƿ�̤�");
		}
	}
}
