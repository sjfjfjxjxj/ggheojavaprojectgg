package com.kh.day07.oop;
//보라색글씨 = 예약어 = 이미 기능이 있는애
class StaticSample{ 
	public int num; 
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	
	public static int input; //static으로 input이 할당돼있어서 위쪽에서 input 써도 오류 안남
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {
    public static void main(String[] args) {
    //	new StaticSample().num = 10;
    	StaticSample.input = 10; 
    	
    	StaticSample s1;
    	s1 = new StaticSample();
    	System.out.println(s1.input); //10오로 초기화해서 10 출력
    	s1.originMethod(); // static선언했기때문에 s1이라는 객체로 안 부르고 StaticSample.originMethod();로 바로 써도 됨
    	System.out.println(s1.input); //오리진메소드 불러서 input값 5 불러와짐
    	
    	int value = Math.abs(-5); //abs: 절대값 구하는거
    	System.out.println("값 : " + value);
    }
}
