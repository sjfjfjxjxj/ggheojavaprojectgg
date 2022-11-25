package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("정수 하나 입력 : ");
    	int input = sc.nextInt();
    	String result=""; //아무것도 안넣으면 그냥 초기화인가봐
    	//짝수판별->출력
    	//(input % 2 ==0) ? "짝수" : "홀수";
    /*	if(input % 2 == 0) {
    		System.out.println(input + "은(는) 짝수입니다."); --->겹치는 부분은 변수로 만들어서
    	} else {
    		System.out.println(input + "은(는) 홀수입니다.");---> 출력은 따로 빼는게 깔끔
    	}
    */	
    	if(input % 2 == 0) {
    		result = "짝수";
    	} else {
    		result = "홀수";
    	}
    	System.out.println(input + "은(는)" + result + "입니다.");
    	
    }
}
