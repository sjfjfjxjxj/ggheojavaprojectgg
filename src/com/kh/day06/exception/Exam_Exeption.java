package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exeption {
    public static void main(String[] args) {
    	try {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("���� �ϳ� �Է�: ");
    		int num1 = sc.nextInt();
    		System.out.print("���� �ϳ� �� �Է�: ");
    		int num2 = sc.nextInt();
    		System.out.println("����������^^");
    		int result = num1 / num2;
    		System.out.println("���� " + result + "�Դϴ�~");
    	}catch(ArithmeticException e) {
    		System.out.println("o���� ������ ������");
    	}
    }
}
//��͵��� �� ����ó���� �ʿ���(=checked exception) 