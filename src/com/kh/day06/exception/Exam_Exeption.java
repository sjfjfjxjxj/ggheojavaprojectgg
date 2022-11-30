package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exeption {
    public static void main(String[] args) {
    	try {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("정수 하나 입력: ");
    		int num1 = sc.nextInt();
    		System.out.print("정수 하나 더 입력: ");
    		int num2 = sc.nextInt();
    		System.out.println("나눠버리면^^");
    		int result = num1 / num2;
    		System.out.println("몫은 " + result + "입니다~");
    	}catch(ArithmeticException e) {
    		System.out.println("o으로 나누지 마씨요");
    	}
    }
}
//어떤것들은 꼭 예외처리가 필요해(=checked exception) 