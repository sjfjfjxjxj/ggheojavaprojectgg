package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);//Scanner��� ġ�� ctrl+space ( ctrl + ���� Ŭ�� �ϸ� ���� Ȯ�ΰ���)
    	//�鰡�̵�޽���
    	System.out.print("int ���� �Է����ּ��� : "); //print�� ln ���̸� �Է� Ŀ���� �ٷο� �ƴϰ� �ؿ��� Ŀ������
    	int input1 = sc.nextInt();
    	System.out.println("�Է��� �� : " + input1);
    	
    	System.out.print("int ���� �ѹ� �� �Է��� �ּ��� : ");
    	int input2 = sc.nextInt();
    	System.out.println("�Է��� �� : " + input2);
    	
    	int result = input1 + input2;
    	System.out.println("�� ���� ���� : "+ result + "�Դϴ�.");
    	//sc.close(); //���⼱ �����ڵ絥 �Ƚ��൵ �ȴ�. �߸� ������ ���� �ð� ����
    }
}
