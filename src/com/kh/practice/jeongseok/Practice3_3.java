package com.kh.practice.jeongseok;

import java.util.Scanner;

//num���� ����� ������ 0����
public class Practice3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String output = ""; 
    	if (num > 0) {
    		output = "���";
    	} else if (num <0) {
    		output ="����";
    	} else {
    		output ="0";
    	}
    	System.out.println(output);
    }
}
