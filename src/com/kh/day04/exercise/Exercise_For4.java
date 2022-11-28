package com.kh.day04.exercise;

// 양수 하나 입력받아서 구구단 출력(그 수가 1~9 사이일때만!)
import java.util.Scanner;

public class Exercise_For4 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 사이의 양수를 입력하세요 : ");
		int number = sc.nextInt(); // number 전역변수 선언
		if ((number <= 9) && (number >= 1)) {
			for (int i = 1; i <= 9; i++) { //i 지역변수 선언
				System.out.println(number + " * " + i + " = " + number * i);
			}
		} else {
			System.out.println("1~9 사이의 양수가 아니잖아요ㅜㅜ");
		}
	}
}
