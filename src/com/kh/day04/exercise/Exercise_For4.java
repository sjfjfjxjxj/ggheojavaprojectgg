package com.kh.day04.exercise;

// ��� �ϳ� �Է¹޾Ƽ� ������ ���(�� ���� 1~9 �����϶���!)
import java.util.Scanner;

public class Exercise_For4 { 
	public static void main(String[] args) {
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
