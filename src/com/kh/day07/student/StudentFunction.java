package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	//int kor;
	//int eng;
	//int math;
	Student student; //여따 선언해도 맞긴 맞아
	
	public StudentFunction() { //초기화 시켜서 스튜던트 클래스를 쓸수있게 됨
		student = new Student(); //생성자 역할에 맞게 코딩...
	//this. 붙여도 되고 안붙여도 됨(헷갈릴거 없으니까 안붙임)
	}
	/**
	 * 학생관리 프로그램 메뉴 출력
	 * @return choice
	 */
	
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----학생성적간리프로그램-----");
    	System.out.println("1. 학생 성적 입력");
    	System.out.println("2. 학생 성적 출력");
    	System.out.println("3. 프로그램 종료");
    	System.out.println("선택 : ");
    	int choice = sc.nextInt();
    	return choice;
    }
    /**
     * 학생 정보 입력
     */
    public void inputScore() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("-----학생 정보 입력-----");
        System.out.print("학생 이름 입력 : ");
        String name = sc.next();
        System.out.println("국어점수 입력: ");
        int kor  = sc.nextInt();
        System.out.println("영어점수 입력: ");
        int eng = sc.nextInt();
        System.out.println("수학점수 입력: ");
        int math = sc.nextInt();
     //   student = new Student(name, kor, eng, math);
        student.setName(name);
        student.setKor(kor);
        student.setEng(eng);
        student.setMath(math);
        
    }
    /**
     * 학생 정보 출력
     */
    public void printScore() {
    	System.out.println("----학생 정보 출력----");
    	System.out.println(student.getName() + "학생의 성적");
    	System.out.println("국어 성적 : " + student.getKor());
    	System.out.println("영어 성적 : " + student.getEng());
    	System.out.println("수학 성적 : " + student.getMath());
    	System.out.println("---------------");
    	
    	
    	
    }
    
    public void goodByeMsg() {
    	System.out.println("잘가...");
    }
    
    public void exceptionMsg() {
    	System.out.println("입력을 정확히 하셍");
    }
}
