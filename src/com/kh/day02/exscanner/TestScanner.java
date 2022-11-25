package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);//Scanner라고 치고 ctrl+space ( ctrl + 툴팁 클릭 하면 내용 확인가능)
    	//↓가이드메시지
    	System.out.print("int 값을 입력해주세요 : "); //print에 ln 붙이면 입력 커서가 바로옆 아니고 밑에서 커서깜빡
    	int input1 = sc.nextInt();
    	System.out.println("입력한 값 : " + input1);
    	
    	System.out.print("int 값을 한번 더 입력해 주세요 : ");
    	int input2 = sc.nextInt();
    	System.out.println("입력한 값 : " + input2);
    	
    	int result = input1 + input2;
    	System.out.println("두 개의 합은 : "+ result + "입니다.");
    	//sc.close(); //여기선 해제코든데 안써줘도 된대. 잘못 닫으면 오류 시게 난대
    }
}
