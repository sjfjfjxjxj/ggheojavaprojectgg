package com.kh.day04.exercise;

import java.util.Scanner;
//���� �ΰ� �����ϴ� ���� ����� �ٽ�!
public class Exercise_Calculator {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������ �Է��ϼ��� : ");
    	int num1 = sc.nextInt();
    	System.out.print("������ �ѹ� �� �Է��� �ּ���: ");
    	int num2 = sc.nextInt();
    	System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
    	char operator = sc.next().charAt(0);
    	int result = 0;
        switch(operator) {
            case '+' : 
            	result = num1 + num2;
                break;
            case '-' : 
            	result = num1 - num2;
                break;
            case '*' : 
            	result = num1 * num2;
                break;
            case '/' : 
            	result = num1 / num2;
                break;
            case '%' : 
            	result = num1 % num2;
                break;
            }
        System.out.println("��� : " + num1 + " " + operator +" "+ num2 + " = " + result);    
    	        //������ ���ڿ��� ������ ���� ����� �̻��ϰ� �ż� " "��� ���� �ʿ�!                
                //�� ��� �� �� ���ڿ��� �־ " " ��� ����� ����� ��(���� �� �𸣰ٴ�)
                //Exercise_PrintSample Ŭ���� ����!
    }
}
