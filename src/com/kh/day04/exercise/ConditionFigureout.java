package com.kh.day04.exercise;
//�� �� �����ϰ� �����ִ� ����� ������̤�
import java.util.Scanner;

//A, B, C ����� ������ �Է� �ް�
//�� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ���
//�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, 
//�̸��̸� ��3000 �̸����� ���
//A ����� �μ�Ƽ��� 0.4
//B ����� �μ�Ƽ��� ������
// C ����� �μ�Ƽ��� 0.15)
public class ConditionFigureout {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("A��� ������ �Է��ϼ���: ");
    	float input = sc.nextFloat();
    	System.out.println("A��� ����: " + input +" + "+ input*0.4 +" : "+ input*1.4);;
    	if(input*1.4>=3000) { 
    		System.out.println("3000 �̻�");
    	} else {
    		System.out.println("3000 �̸�");
    	}
    	System.out.print("B��� ������ �Է��ϼ���: ");
    	input = sc.nextInt(); 
    	System.out.println("B��� ����: " + input +" + "+ input*0 +" : "+ input*1);;
    	if(input*1.0>=3000) { 
    		System.out.println("3000 �̻�");
    	} else {
    		System.out.println("3000 �̸�");
    	}
    	System.out.print("C��� ������ �Է��ϼ���: ");
    	input = sc.nextInt(); 
    	System.out.println("C��� ����: " + input +" + "+ input*0.15 +" : "+ input*1.15);
    	if(input*1.15>=3000) { 
    		System.out.println("3000 �̻�");
    	} else {
    		System.out.println("3000 �̸�");
    	}
    }
}
