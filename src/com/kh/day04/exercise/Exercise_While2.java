package com.kh.day04.exercise;

import java.util.Scanner;

//��� �ϳ� �Է¹޾Ƽ� ������ ���(�� ���� 1~9 �����϶���!)
public class Exercise_While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1~9������ ������ �Է��� �ּ��� : ");
			int input = sc.nextInt();
			if (input >= 1 && input <= 9) {
				int i = 1;
				while (i <= 9) {
					System.out.println(input + " * " + i + " = " + input * i);
					i++;  //�١��߿�!! �� ���Դ°�. �Ƚ��ָ� �������� �����ų� ����� �ȵ�
				}
			} else {
				System.out.println("1~9 ������ ������ �ƴϿ���. �ٽ� �� �� �Է��ϼ���.");
			}
		}
	}
}
