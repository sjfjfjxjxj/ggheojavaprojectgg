package com.kh.practice.condition;

import java.util.Scanner;

public class HomeworkSwitchOperator {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���ڸ� �Է��ϼ��� : ");
    	int num1 = sc.nextInt();
    	System.out.println("���ڸ� �� �� �� �Է��ϼ��� : ");
    	int num2 = sc.nextInt();
    	System.out.println("�����ڸ� �Է����ּ��� : ");   	
        char operator = sc.next().charAt(0); 
        int result = 0;
        switch (operator) {
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
        System.out.println(num1 + " " + operator +" "+ num2 + " = " + result);
      
        
    }
}
