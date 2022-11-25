package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
    public static void main(String[] args) {
    	// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요.
    	Scanner sc = new Scanner(System.in);
    	System.out.print("정수를 입력해 주세요 : ");
    	int num = sc.nextInt();
    	boolean result = (num >= 1) && (num <= 100);
    	System.out.println("1부터 100 사이의 숫자인가 : "+result);
    	//입력값에 문자나 소숫점 쓰면 exception 뜸! 101부터는 false 잘뜸
    }
}
