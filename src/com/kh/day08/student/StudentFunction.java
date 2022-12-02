package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
    Student [] students; //배열선언
    
    public StudentFunction() { 
    	students = new Student[3];//생성자에서 초기화해주기 //배열할당
    }
    
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----학생 성적 확인 프로그램-----");
    	System.out.println("1. 학생 성적입력");
        System.out.println("2. 학생 성적 출력");
        System.out.println("3. 재평가 여부 확인");
        System.out.println("4. 프로그램 종료");
        System.out.println("메뉴 입력 : ");
        int menu = sc.nextInt(); //메뉴 변수는 냅두면 사라짐. 그래서 리턴해
        return menu;
    }
    
    public void inputScore() {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i < students.length; i++) { //3번 받을거니깐
    		System.out.println("-----" + (i+1) + "번째 학생 정보 입력-----");//index는 1부터니까
    		System.out.print("학생 이름 입력: ");
    		String name = sc.next();
    		System.out.print("1차 점수 입력: ");
    		int firstScore = sc.nextInt();
    		System.out.print("2차 점수 입력: ");
    		int secondScore = sc.nextInt();
    		students[i] = new Student(); //배열에 데이터 하나하나 저장
    		students[i].setName(name);
    		students[i].setFirstScore(firstScore);
    		students[i].setSecondScore(secondScore);
    	}
    }
    
    public void printScore() {
    	for(int i = 0; i < students.length; i++){
    		System.out.println("-----" + (i+1) + "번째 학생 정보 출력-----");
    		System.out.println(students[i].getName()+"학생의 점수는");
    		System.out.println("1차점수: "+students[i].getFirstScore() +" / "+ "2차점수: "+students[i].getSecondScore() + "입니다");
    	}               //이쪽에는 setter 쓰며 ㄴ안되나??
    }
    
    public void checkPass() {
    	/*
    	 * 0. 재평가 여부는 각각으로. 
    	 * 1. 각각의 점수가 40점 미만인 경우 재평가 대상자 됨 students[i]getscore<40
    	 * 2. 1차 2차 점수 평균은 60 넘어야 pass
    	 * 3. 1차 2차 점수 평균이 60 미만인 경우 60 미만 과목에 대해서만 재평가.
    	 */
//    	for(int i = 0; i<students.length;  i++) {
//    		if (students[i].getFirstScore()< 40 && students[i].getSecondScore()<40) {
//    			System.out.println("전체 재평가 대상입니다");
//    		} else if (students[i].getFirstScore()+students[i].getSecondScore()/students.length<60) {
//    			//60 안되는 과목 재평가
//    			if(students[i]getFirstScore()<60) {
//    				System.out.println("1차 시험 재평가 대상입니다.");
//    			}else {
//    				System.out.println("2차 시험 재평가 대상입니다.");
//    			}
//    			
//    			
//    		} else {
//    			System.out.println("전통과하였습니다");
//    		}
//    		
//    	}
//    	int num1 = 1;
//    	int num2 = 2;
//    	int avg = (num1+num2) / (double)2;
//    	if(avg >=60) {
//    		1. 만약 num<40 있음 걔만 재평가
//    		2. 둘다 num >40이면 전부 통과
//    	} else {
//    		1. num1<40 || num2< 40 - 과목마다 재평가
//    		2. num < 60 걔만 재평가
//    	}
    	//이렇게 해도돼
//    	if(num1 < 40) {
//    		System.out.println("1차 시험 재평가 대상자입니다.");
//    	}else if(num2 < 40) {
//    		System.out.println("2차 시험 재평가 대상자입니다.");
//    	}else if(avg >= 60){
//    		System.out.println("통과하였습니다.");
//    	}else {
//    		if(num1 < 60) {
//    			System.out.println("1차 시험 재평가 대상자입니다.");
//    		}else if(num2 < 60) {
//    			System.out.println("2차 시험 재평가 대상자입니다.");
//    		}
//    	}

    	for(int i = 0; i < students.length; i++) {
    		int num1 = students[i].getFirstScore();
    		int num2 = students[i].getSecondScore();
    		double avg = (num1+num2) / (double)2;
    		System.out.println((i+1) + "번째," + students[i].getName() + " 학생의 확인 결과");
    		if(avg >= 60) {
    			//예외발생
    			//1차-20 2차-100 / 1차-100 2차-20...
    			if(num1 < 40) {
    				System.out.println("1차 시험 재평가 대상입니다.");
    			}else if(num2 < 40) {
    				System.out.println("2차 시험 재평가 대상입니다.");
    			}else {
    				System.out.println("통과하였습니다.");
    			}
    		}else {
    			//통과못한사람: p-f / f-p / f-f
    			if(num1 < 60) {
    				System.out.println("1차시험 재평가 대상자입니다.");
    			}
                if(num2 < 60) {//else로 쓰면 체크 한번 하고 맞으면 안넘어감. 각각 체크하려고!
    				System.out.println("2차 시험 재평가 대상자입니다.");
    			}
    		}
    		
    		
    	}
    	
    	
    }
    
    public void printGoodBye() {}
    
    public void printException() {}
}













