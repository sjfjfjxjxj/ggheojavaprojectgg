package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
    public void exercise1(){
        int i = 1;
        int sum = 0;
        while (i < 100) {
    	    sum = sum + i;
    	   // i = i + 2;
    	    i += 2; //�����Ŷ� ����. ���մ��Կ�����. 
    	    //i = i * 2 -> i *= 2;
        }
        System.out.println("�հ� : " + sum);
    }
    public void exercise2() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1~9������ ������ �Է��� �ּ��� : ");
			int input = sc.nextInt();
			if (input >= 1 && input <= 9) {
				int i = 1;
				while (i <= 9) {
					System.out.println(input + " * " + i + " = " + input * i);
					i++;  //�١��߿�!! �� ���Դ°�. �Ƚ��ָ� �������� �����ų� ����� �ȵ�
				}
			} else {
				System.out.println("1~9 ������ ������ �ƴϿ���. �ٽ� �� �� �Է��ϼ���.");
			}
		}
    }
    public void exercise3() {
        int sum = 0;     
        int input = 0;
        while (input != -1) { //num!=1�̸� ��� ����!
        	Scanner sc = new Scanner(System.in);
        	System.out.print("������ �Է��� �ּ���."); // �Է°��� -1���� ��� üũ�Ѵ�
        	input = sc.nextInt();
        	if(input != -1) {
        		sum = sum + input; // -> sum += input        		
        	}
        } 
        /*while(true) {
    		System.out.print("���� �ϳ� �Է� : ");
    		input = sc.nextInt();
    		if(input == -1) break;
    	}*/ 
    	//sum += input;
        System.out.println("�Է��� ���� ���� : " + sum);
    }
}
