package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
    public static void main(String[] args) {
    	// �Է��� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���.
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������ �Է��� �ּ��� : ");
    	int num = sc.nextInt();
    	boolean result = (num >= 1) && (num <= 100);
    	System.out.println("1���� 100 ������ �����ΰ� : "+result);
    	//�Է°��� ���ڳ� �Ҽ��� ���� exception ��! 101���ʹ� false �߶�
    }
}
