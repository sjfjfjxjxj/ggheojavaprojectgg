package com.kh.day06.exercise;
//성적 입력하는 프로그램 만들기 연습
import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ESCAPE: //while문 전체 브레이크 단어(아무거나 만들어도됨)
	    while (true) {  //무한반복
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			int korean = 0;
			int english = 0;
			int math = 0;
			int sum = 0;

			switch (choice) {
			case 1:
				System.out.println("=====성적입력=====");
				System.out.print("국어: ");
				korean = sc.nextInt();
				System.out.print("영어: ");
				english = sc.nextInt();
				System.out.print("수학: ");
				math = sc.nextInt();

				System.out.println("===== 메인 메뉴 =====");
				System.out.println("1. 성적입력");
				System.out.println("2. 성적출력");
				System.out.println("3. 종료");
				System.out.print("선택 : ");
				sc.nextInt();
			case 2:
				sum = korean + english + math;
				System.out.println("==== 성적출력 ====");
				System.out.println("국어: " + korean);
				System.out.println("영어: " + english);
				System.out.println("수학: " + math);
				System.out.println("총점: " + sum);
				System.out.printf("평균: : %.2f\n", (double)sum / 3);
				break; // 소숫점 두자리까지 표현하기위해!!!
			case 3:
				System.out.println("Good Bye~");
				break ESCAPE;
			default : 
				System.out.println("1 ~ 3 사이의 숫자를 입력하세유ㅠㅠ");

			}
		}
	}

}

/*
 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 1
 * 
 * ====== 성적 입력 ======= 국어 : 50 영어 : 40 수학 : 30
 * 
 * 
 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 2
 * 
 * ====== 성적 출력 ====== 국어 : 50 영어 : 40 수학 : 30
 * 
 * 총점 : 120 평균 : 40.00
 * 
 * ====== 메인 메뉴 ======= 1. 성적입력 2. 성적출력 3. 종료 선택 : 3
 * 
 * Good Bye~
 * 
 */
