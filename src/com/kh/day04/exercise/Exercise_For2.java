package com.kh.day04.exercise;
//1���� 10������ ������ ǥ���ϰ� �յ� ���ϼ���(���: 1+2+...+10=55)
public class Exercise_For2 {
    public static void main(String[] args) {
    	int sum = 0;
    	for (int i = 1; i <= 10; i++) {   	
    		sum = sum + i;
    		System.out.print(i);
    		if(i <= 9) {
    			System.out.print("+");
    		} else {
    			System.out.print("=");
    		}
     	}  	
    	System.out.println(sum);
    }
}
