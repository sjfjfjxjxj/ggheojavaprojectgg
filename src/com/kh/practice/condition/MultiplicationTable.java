package com.kh.practice.condition;
//�����ܤ��� �ڵ� ���̷��̤� (���ݱ��� ����  if��, swhitch-case��)
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("�˰���� �ܼ��� �Է��ϼ��� : ");
    	int num = sc.nextInt();  //num=�ܼ�, multiple = ����, ��� =  result
    	int multiple = 1;
    	int result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);

    	
//�����    	
    	/*switch (num){
    		case 1: result = multiple * 1;  		
    		   break;

    	}
    	System.out.println(num + " * " + multiple + " = " + result);*/
    }
}
