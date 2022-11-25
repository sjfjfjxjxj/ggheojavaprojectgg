package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
    public static void main(String[] args) {
    	//입력받을 수 있는 데이터는 정수, 실수, 문자열, 문자(*특이하니 기억할것)
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("정수를 입력해 주세요 : ");
    	int iNum = sc.nextInt();
    	
    	System.out.print("실수를 입력해 주세요: ");
    	double dNum = sc.nextDouble();
    	
    	System.out.print("문자열을 입력해 주세요 : ");
    	String words = sc.next(); // nextString 그런거 아님
    	
    	System.out.print("문자를 입력해 주세요 : ");
    	char word = sc.next().charAt(1); //문자열에서 첫번째 값(0)을 잘라주는 형태로 씀. 1이면 두번째문자
    	
    	System.out.println("입력한 정수는 : " + iNum);
    	System.out.println("입력한 실수는 : " + dNum);
    	System.out.println("입력한 문자열은 : " + words);
    	System.out.println("입력한 문자는 : " + word);
    }
}
