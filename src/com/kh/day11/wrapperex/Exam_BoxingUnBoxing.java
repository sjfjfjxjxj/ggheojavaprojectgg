package com.kh.day11.wrapperex;
//다시보기
public class Exam_BoxingUnBoxing {
    public static void main(String [] args) {
    	Integer num = Integer.valueOf(0); //뉴인테저 안되고 밸류오브로 객체 생성하는데
    	//Boxing으로 쉽게! 자동으로!
    	Integer su = 100;
    	
    	int soo = num.intValue(); //기본형으로 바꾸는 이것도 번거로우니까
    	//UnBoxing으로 자동!
    	soo = num;
    	
    	int n = 10;
    	Integer intObject = n;
    	System.out.println("intObject : " + intObject); //박싱 가동! 10 출력
    	
    	int m = intObject + 10;
    	System.out.println("m = " + m); //언박싱 가동! 20 출력
    	
    }
}
