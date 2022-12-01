package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor;//스코어펑션의 멤버변수들이당
	private int eng; //점수는 개인적인거니까 캡슐화해벌여
	private int math; //다른 클래스(student클래스)로 보내자!
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----메인메뉴----");
    	System.out.println("1. 성적입력");
    	System.out.println("2. 성적출력");
    	System.out.println("3. 종료");
    	System.out.print("선택 : ");
    	int choice = sc.nextInt();
    	return choice;
    	
    	
    }
    
    public void inputScore() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("----성적입력----");
    	System.out.print("국어 : ");
    	kor = sc.nextInt();
    	System.out.print("영어 : " );
    	eng = sc.nextInt();
    	System.out.print("수학 : ");
    	math = sc.nextInt();
    }
    
    public void printScore() {
    	System.out.println("----성적출력----");
    	System.out.println("국어 : " + kor);
    	System.out.println("영어 : " + eng);
    	System.out.println("수학 : " + math);
    	
    }
    
    public void goodByeMsg() {
    	System.out.println("Good Bye!");
    }
    
    public void exceptionMse() {
    	System.out.println("1~3 사이 숫자 입력하세요");
    }
}
