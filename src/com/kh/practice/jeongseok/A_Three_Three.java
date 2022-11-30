package com.kh.practice.jeongseok;

import java.util.Scanner;

//num값이 양순지 음순지 0인지
public class A_Three_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String output = ""; 
    	if (num > 0) {
    		output = "양수";
    	} else if (num <0) {
    		output ="음수";
    	} else {
    		output ="0";
    	}
    	System.out.println(output);
    }
}
