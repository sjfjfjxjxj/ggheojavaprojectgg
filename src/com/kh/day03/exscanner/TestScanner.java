package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("�̸��� �Է��� �ּ��� : ");
    	String name = sc.next();
    	System.out.println("�¾ ���� �Է��� �ּ��� : ");
    	int month = sc.nextInt();
    	System.out.println("Ű�� �Է���  �ּ��� : ");
    	double height = sc.nextDouble();
    	// int height = sc.nextInt(); �� �߾���. �Ҽ��� �����ϱ� ������ �� ����!
    	System.out.println("������ �Է��� �ּ��� : ");
    	char gender = sc.next().charAt(0);
    	//String gender = sc.next(); �� �߾���. �� or �� �� �����Ϸ��� �̰ͺ��� charAt ����� ���ڴ�
    	System.out.println("�ּҸ� �Է��� �ּ��� : ");
    	sc.nextLine(); //���� ����
    	String adress = sc.nextLine();
    	
    	System.out.println("�̸��� " + name + " �Դϴ�.");
    	System.out.println("�¾ ���� " + month + "�� �Դϴ�.");
    	System.out.println("Ű�� " + height + "cm �Դϴ�.");
    	System.out.println("������ " + gender + "�� �Դϴ�.");
    	System.out.println("��� ���� " +adress+ " �Դϴ�.");
    	
    }
}
