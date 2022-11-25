package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// 정수 입력받아서 양수, 음수, 0 판별 프로그램 만들기! ^0^
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		String result = ""; // 변수 초기화는 기본☆
		if (input > 0) {
			result = "양의 정수";
		} else if (input < 0) {
			result = "음의 정수";
		} else {
			result = "0";
		}
		System.out.println(input + "은(는) " + result + "입니다.");
	}
}
// ctrl shift f = indent 정리(들여쓰기 내어쓰기 정리해줌)