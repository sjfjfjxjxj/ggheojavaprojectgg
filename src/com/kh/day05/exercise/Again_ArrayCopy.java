package com.kh.day05.exercise;
//또해보기ㅜㅜ
import java.util.Scanner;

public class Again_ArrayCopy {
    public static void main(String [] args) {
    	/*
		 * 사용자에게 주민번호를 입력 받은 후 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오 210618-1124600 ->
		 * 210618-1****** 200518-3233920 -> 200518-3******		  
		 */
    	Scanner sc = new Scanner(System.in);
    	char [] origin = new char[14]; //orgin이라는 배열은 문자가 있는 방 14개짜리!
    	System.out.print("주민등록번호 14자리(-) 입력하셍 : ");
    	String memberNum = sc.next();
    	for(int i = 0; i < origin.length; i++) {
    		origin[i] = memberNum.charAt(i);  //14글자 입력 다 받음. 이 값은 보존하고 		
    	}  
    	char[] copy = new char[14]; // 복사해서 후처리할거야
        for(int i = 0; i < origin.length; i++) {
    	    if( i < 8) {
    	    	copy[i] = origin[i];
    	    	
    	    } else {
    	    	copy[i] =  '*';
    	    }
    	    System.out.print(copy[i] + " ");
    	
        } 
}
}
