package com.kh.day06.exercise;
//구조적프로그래밍을 해보자. 객체지향으로 가는 관문,,
import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	static int korean = 0; //변수를 바로 사용하기위해 static 붙임
	static int english = 0;
	static int math = 0; //전역변수(=클래스변수) 선언
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
        TERMINATE:
    	while(true) {
    		printMenu(); //메인메뉴를 출력해보자
    		int choice = sc.nextInt();
    		switch(choice) {
    		case 1 : 
    			inputScore();
    			break;
    		case 2 : 
    			printScore();
    			break;
    		case 3 : 
    			goodByeMsg();
    			break TERMINATE;
    		default : 
    			printException();
    			break;
    		}
    	}//static을 너무 많이 쓰면 용량 커져서 작동 잘 안된대.
    }   //메인에서 바로 쓸라면 스태틱을 붙여야한대. 뉴 안붙여도 되게끔
    public static void printMenu() {
    	System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
    }
    public static void inputScore() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("=====성적입력=====");
		System.out.print("국어: ");
		korean = sc.nextInt();
		System.out.print("영어: ");
		english = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
    }
    public static void printScore() {
    	int sum = korean + english + math;
    	System.out.println("==== 성적출력 ====");
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + sum);
		System.out.printf("평균: : %.2f\n", (double)sum / 3);
    }
    public static void goodByeMsg() {
    	System.out.println("Good Bye~");		
    }
    public static void printException() {
    	System.out.println("1 ~ 3 사이의 숫자를 입력하세유ㅠㅠ");
    }
}
