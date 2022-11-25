package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
    public static void main(String[] args) {
    	//입력받은 문자가 대문자인지 소문자인지 보기
    	Scanner sc = new Scanner(System.in);
    	System.out.print("문자를 입력해 주세요 : ");
    	char word = sc.next().charAt(0);
    	boolean result = (word >= 65) && (word <= 90);
    	System.out.println("대문자입니까 : "+ result); 
  
    	
    }
}
