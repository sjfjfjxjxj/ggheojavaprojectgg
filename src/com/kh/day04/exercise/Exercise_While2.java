package com.kh.day04.exercise;

import java.util.Scanner;

//양수 하나 입력받아서 구구단 출력(그 수가 1~9 사이일때만!)
public class Exercise_While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1~9사이의 정수를 입력해 주세요 : ");
			int input = sc.nextInt();
			if (input >= 1 && input <= 9) {
				int i = 1;
				while (i <= 9) {
					System.out.println(input + " * " + i + " = " + input * i);
					i++;  //☆☆중요!! 잘 빼먹는것. 안써주면 무한으로 나오거나 출력이 안됨
				}
			} else {
				System.out.println("1~9 사이의 정수가 아니예요. 다시 한 번 입력하세요.");
			}
		}
	}
}
