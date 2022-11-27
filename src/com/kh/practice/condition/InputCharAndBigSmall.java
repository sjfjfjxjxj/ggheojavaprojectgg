package com.kh.practice.condition;

import java.util.Scanner;
//입력한 문자가 대문자인지 소문자인지 확인하세요
public class InputCharAndBigSmall {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("영어 문자를 입력해주세요 : ");
    	char input = sc.next().charAt(0);
    	//boolean result = (input >= 65) && (90 >= input); 
    	//System.out.println("대문자입니까 : " + result);
    	String result = "";
    	if ((input >= 65) && (90 >= input)) {
    		result = "대문자";
    	} else if ((input >= 97) && (122 >= input)) {
    		result = "소문자";
    	} else {
    		result = "오류";
    	}
    	System.out.println("입력한 문자는 " + result + "입니다.");
    	//input 설정할때 65 대신 a를 입력하면 multiple markers at this line 이라는 오류가 뜸
    }
}
