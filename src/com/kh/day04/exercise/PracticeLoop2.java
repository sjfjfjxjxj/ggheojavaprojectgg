package com.kh.day04.exercise;

import java.util.Scanner;

//	한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 출력 
//단, 입력한 수는 1보다 크거나 같아야 합니다.
//만일 1 미만의 숫자가 입력됐다면 
//“1 이상의 숫자를 입력해주세요“를 출력하세요.
//ex.1이상의 숫자를 입력하세요 : 4 
//1 2 3 4
public class PracticeLoop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1보다 크거나 같은 정수 하나를 입력 :");
			int input = sc.nextInt();
			int output = 1;
			if (input > 0) {
				while (output <= input) {
					System.out.print(output++ + " ");
				}
			} else {
				System.out.println("1 이상의 수를 입력하세요!!!");
			}
			System.out.println();
		}
	}
}
