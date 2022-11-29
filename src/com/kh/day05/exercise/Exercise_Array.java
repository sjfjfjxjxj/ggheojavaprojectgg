package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이 100 배열선언, 1~100까지 값 넣어 순서대로 값 출력
		int[] hundreds = new int[100];
		for (int i = 0; i < hundreds.length; i++) {
			hundreds[i] = i;
			System.out.println(hundreds[i] + " ");
		}
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면(if!) 바나나를 출력해보세요!
		String[] fruits = new String[5];
		fruits[0] = "딸기";
		fruits[1] = "복숭아";
		fruits[2] = "키위";
		fruits[3] = "사과";
		fruits[4] = "바나나";
		// 할당과 초기화를 동시에!
		String[] fruitGoods = { "딸기", "복숭아", "키위", "사과", "바나나" };
		for (int i = 0; i < fruitGoods.length; i++) {
			if (fruitGoods[i] == "바나나") {
				System.out.println(fruitGoods[i] + " ");
			}
		}
	}

	public void exercise3() {
		// 양수 5개 입력받아 배열에 저장하고 평균 구하기
		int[] arrs = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개를 입력해주세요 : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균값은 : " + (double) sum / arrs.length + "입니다.");
	} // 소숫점 소실되지 않게 강제형변환 하나 해주기

	public void exercise4() {
		// 양의 정수 5개 입력받아 배열에 저장하고 제일 큰수 출력(두개를 비교해서 큰쪽을 변수에 넣음)
		int[] arrs = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개 입력하세용 : ");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			if (arrs[i] > max) {
				max = arrs[i];
			}
		}
		System.out.println("제일 큰 수는 : " + max);
	}

	public void exercise5() {
		/*
		 * 사용자에게 주민번호를 입력 받은 후 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오 210618-1124600 ->
		 * 210618-1****** 200518-3233920 -> 200518-3******
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14]; //origin은 입력 원본 민번
		System.out.print("주민등록번호 13자리(-포함)을 입력: ");
		String memberNum = sc.next();
		for (int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);	//14자리 입력해서 자리마다 할당을 해줌	
		}
		// char [] copy = origin; //마스킹 할 배열을 만들어야하는데 이것은 카피가 아니당.
		char[] copy = new char[14]; // 그래서 14개짜리 공간 할당을 하나 더함=깊은 복사
		for (int i = 0; i < origin.length; i++) {
			if (i < 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';				
			}
			System.out.print(copy[i]);
		}
		System.out.println(); //개행
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);    //이렇게 원본데이터도 살아있다(바뀌는거없음)
		}

	}
}
