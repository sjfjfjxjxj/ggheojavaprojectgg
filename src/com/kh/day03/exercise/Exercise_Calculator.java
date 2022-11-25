package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// 두개 정수 입력받고 연산자 입력받아 계산하는 프로그램 작성!
		// 정수 하나 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 :");
		int num1 = sc.nextInt();
		System.out.print("정수를 한번 더 입력해 주세요 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력해 주세요(+,-,*,/,%) : ");
		char cal = sc.next().charAt(0);
		int result = 0;
		if (cal == '+') {
			result = num1 + num2;
		} else if (cal == '-') {
			result = num1 - num2;
		} else if (cal == '*') {
			result = num1 * num2;
		} else if (cal == '/') {
			result = num1 / num2;
		} else {
			result = num1 % num2;
		}
		System.out.print("결과 : " + num1 + " " + cal + " " + num2 + " = " + result);

	}
}
