package com.kh.practice.condition;

import java.util.Scanner;
//�Է��� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���
public class InputCharAndBigSmall {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("���� ���ڸ� �Է����ּ��� : ");
    	char input = sc.next().charAt(0);
    	//boolean result = (input >= 65) && (90 >= input); 
    	//System.out.println("�빮���Դϱ� : " + result);
    	String result = "";
    	if ((input >= 65) && (90 >= input)) {
    		result = "�빮��";
    	} else if ((input >= 97) && (122 >= input)) {
    		result = "�ҹ���";
    	} else {
    		result = "����";
    	}
    	System.out.println("�Է��� ���ڴ� " + result + "�Դϴ�.");
    	//input �����Ҷ� 65 ��� a�� �Է��ϸ� multiple markers at this line �̶�� ������ ��
    }
}
