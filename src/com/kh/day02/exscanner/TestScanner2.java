package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
    public static void main(String[] args) {
    	//�Է¹��� �� �ִ� �����ʹ� ����, �Ǽ�, ���ڿ�, ����(*Ư���ϴ� ����Ұ�)
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("������ �Է��� �ּ��� : ");
    	int iNum = sc.nextInt();
    	
    	System.out.print("�Ǽ��� �Է��� �ּ���: ");
    	double dNum = sc.nextDouble();
    	
    	System.out.print("���ڿ��� �Է��� �ּ��� : ");
    	String words = sc.next(); // nextString �׷��� �ƴ�
    	
    	System.out.print("���ڸ� �Է��� �ּ��� : ");
    	char word = sc.next().charAt(1); //���ڿ����� ù��° ��(0)�� �߶��ִ� ���·� ��. 1�̸� �ι�°����
    	
    	System.out.println("�Է��� ������ : " + iNum);
    	System.out.println("�Է��� �Ǽ��� : " + dNum);
    	System.out.println("�Է��� ���ڿ��� : " + words);
    	System.out.println("�Է��� ���ڴ� : " + word);
    }
}
