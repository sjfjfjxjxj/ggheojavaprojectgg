package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� ���, ����, 0 �Ǻ� ���α׷� �����! ^0^
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		String result = ""; // ���� �ʱ�ȭ�� �⺻��
		if (input > 0) {
			result = "���� ����";
		} else if (input < 0) {
			result = "���� ����";
		} else {
			result = "0";
		}
		System.out.println(input + "��(��) " + result + "�Դϴ�.");
	}
}
// ctrl shift f = indent ����(�鿩���� ����� ��������)