package com.kh.day04.exercise;

import java.util.Scanner;

//	�� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� �Ųٷ� ��� 
//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
//���� 1 �̸��� ���ڰ� �Էµƴٸ� 
//��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
//ex.1�̻��� ���ڸ� �Է��ϼ��� : 4 
//4 3 2 1
public class PracticeLoop1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("1���� ũ�ų� ���� ���� �ϳ��� �Է� :");
    	int input = sc.nextInt();
    	int output = 0;
    	if (input>=1) {
    		while(input>0) {
    			System.out.print(input + " ");
    			input--;
    		}
    	}else {
    		System.out.println("1 �̻��� ���ڸ� �Է��� �ּ���");
    	}
    }
}
