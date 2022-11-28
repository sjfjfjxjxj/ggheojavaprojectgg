package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

//동전 앞뒤 맞히기
public class Exercise_Random1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		for (;;) {
			System.out.println("=====동전 앞 뒤 맞히기=====");
			System.out.print("숫자를 입력해주세요(1.앞면/2.뒷면) : ");
			int choice = sc.nextInt();
			// computer 변수에는 1 또는 2의 값이 랜덤하게 들어가야함
			int computer = rand.nextInt(2) + 1;
			System.out.println("컴퓨터 : " + computer);
			// choice의 값과 computer 값이 같으면 맞혔습니다. 다르면 틀렸습니다.
			if (choice == computer) {
				System.out.println("맞혔습니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
		}
	}
}
