package com.kh.day11.wrapperex;

public class Exam_Wrapper_ValueOf_Again {
    public static void main(String[] args) {
    	int num = 0;
    	Integer su = Integer.valueOf(0);
    	System.out.println(Character.toLowerCase('A'));
    	char c1 = '4', c2 = 'F';
    	if(Character.isDigit(c2)) {
    		System.out.println("숫자");
    	}
    	if(Character.isAlphabetic(c1)) {
    		System.out.println("영문자");
    	}//이랬을땐 아무것도 출력이 안됨
    	
   
    }
}
