package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {
    public static void main(String[] args) {
    	/*
    	 * 3�� ������(�׸��� 3��)
    	 * [���ǽ�] ? ���� �� : ������ ��
    	 * -���ǽ��� �ݵ�� true or false�� ��ȯ
    	 * -��/�������� �ַ� ���
    	 */
    	//(num1 > num2) ? "��" : "����"; 
    	//��, ���� = ���ͷ� = ��, ���� if�� �Ⱦ��� �����Ѱ� ���Ҷ�
    	//������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷� �ۼ��ϱ�
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������ �Է��ϼ��� : ");
    	int input = sc.nextInt();
        String result = (input % 2 == 0) ? "¦��" : "Ȧ��";
        System.out.println(input + "��(��) " + result + "�Դϴ�."); 
    }
}
