package com.kh.practice.condition;

import java.util.Scanner;

public class HomeworkSwitchOperator {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("���ڸ� �Է��ϼ��� : ");
    	int num1 = sc.nextInt();
    	System.out.println("���ڸ� �� �� �� �Է��ϼ��� : ");
    	int num2 = sc.nextInt();
    	System.out.println("�����ڸ� �Է��ϼ���");
    	//System.out.println("1: +");
    	//System.out.println("2: -");
    	//System.out.println("3: *");
    	//System.out.println("4: /");
    	//System.out.println("5: %");
        char operator = sc.next().charAt(0);
        int result = 0;
        char case = "";
        switch (result) {
            case "+" :  
            	System.out.println(result = num1 + num2);
            	
            case 2 :
            	System.out.println(result = num1 - num2);
            	break;
            case 3 :
            	System.out.println(result = num1 * num2);
            	break;
            case 4 :
            	System.out.println(result = num1 / num2);
            	break;
            case 5 :
            	System.out.println(result = num1 % num2);
            	break;
        }
        
    }
}
