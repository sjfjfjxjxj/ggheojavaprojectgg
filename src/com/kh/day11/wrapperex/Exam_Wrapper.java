package com.kh.day11.wrapperex;

public class Exam_Wrapper {
    public static void main(String[] args) {
    	int num = 0;
//    	Integer su = new Integer(0); 예전엔 이렇게 썼따
    	Integer su = Integer.valueOf(0);
    	System.out.println(Character.toLowerCase('A')); //출력: a
    	char c1 = '4', c2 = 'F';
    	if(Character.isDigit(c1)) {//스태틱 메소드들이라 객체 생성 안하고 쓴당
    		System.out.println(c1+"은 숫자");
    	}
    	if(Character.isAlphabetic(c2)) {
    		System.out.println(c2+"는 영문자");
    	} 
    }
}
