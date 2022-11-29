package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// ���� 100 �迭����, 1~100���� �� �־� ������� �� ���
		int[] hundreds = new int[100];
		for (int i = 0; i < hundreds.length; i++) {
			hundreds[i] = i;
			System.out.println(hundreds[i] + " ");
		}
	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������(if!) �ٳ����� ����غ�����!
		String[] fruits = new String[5];
		fruits[0] = "����";
		fruits[1] = "������";
		fruits[2] = "Ű��";
		fruits[3] = "���";
		fruits[4] = "�ٳ���";
		// �Ҵ�� �ʱ�ȭ�� ���ÿ�!
		String[] fruitGoods = { "����", "������", "Ű��", "���", "�ٳ���" };
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "�ٳ���") {
				System.out.println(fruitGoods[i] + " ");
			}
		}
	}

	public void exercise3() {
		// ��� 5�� �Է¹޾� �迭�� �����ϰ� ��� ���ϱ�
		int[] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5���� �Է����ּ��� : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("��հ��� : " + (double) sum / arrs.length + "�Դϴ�.");
	} // �Ҽ��� �ҽǵ��� �ʰ� ��������ȯ �ϳ� ���ֱ�

	public void exercise4() {
		// ���� ���� 5�� �Է¹޾� �迭�� �����ϰ� ���� ū�� ���(�ΰ��� ���ؼ� ū���� ������ ����)
		int[] arrs = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է��ϼ��� : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			if (arrs[i] > max) {
				max = arrs[i];
			}
		}
		System.out.println("���� ū ���� : " + max);
	}

	public void exercise5() {
		/*
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� �� ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ� 210618-1124600 ->
		 * 210618-1****** 200518-3233920 -> 200518-3******
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14]; //origin�� �Է� ���� �ι�
		System.out.print("�ֹε�Ϲ�ȣ 13�ڸ�(-����)�� �Է�: ");
		String memberNum = sc.next();
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);	//14�ڸ� �Է��ؼ� �ڸ����� �Ҵ��� ����	
		}
		// char [] copy = origin; //����ŷ �� �迭�� �������ϴµ� �̰��� ī�ǰ� �ƴϴ�.
		char[] copy = new char[14]; // �׷��� 14��¥�� ���� �Ҵ��� �ϳ� ����=���� ����
		for (int i = 0; i < origin.length; i++) {
			if (i < 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';				
			}
			System.out.print(copy[i]);
		}
		System.out.println(); //����
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);    //�̷��� ���������͵� ����ִ�(�ٲ�°ž���)
		}

	}
}
