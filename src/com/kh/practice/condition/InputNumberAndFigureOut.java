package com.kh.practice.condition;

import java.util.Scanner;
//�Է��� ������ 1~100������ �������� Ȯ���ϼ���
//�ΰ��� ������� �غ�. �ٵ� boolean���� �ϴ°� �ߺ� ��� �� ����ѵ�!
public class InputNumberAndFigureOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������ �Է��ϼ��� : ");
        int input = sc.nextInt();
        // boolean result = (input >= 1) && (100 >= input);       
        // System.out.println("1���� 100 ������ �����ΰ��� : " +  result);
        if ((input >= 1) && (100 >= input)) {
        	System.out.println("1���� 100 ������ �����ΰ��� : true");
        } else {
        	System.out.println("1���� 100 ������ �����ΰ��� : false");
        }
    }
}
