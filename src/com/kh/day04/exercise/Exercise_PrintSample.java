package com.kh.day04.exercise;

public class Exercise_PrintSample {
    public static void main(String[] args) {
    	// System.out.println에서 정수 + 문자열 -> 문자열
    	System.out.println(1 + "1"); //출력: 11(계산안됨)
    	// 문자 + 문자 -> 문자
    	System.out.println('1' + '1'); //출력: 98(11은 문자열이니까 숫자로 매핑이 됨)
    	                               //1=아스키코드표에서 49 해당
    	//정수 + 정수 + 문자열+ 정수 -> 문자열. 중간에 문자열 하나라도 있으면 최종적으론 문자열됨
    	System.out.println(10 + 20 + "Hello" + 10); //출력: 30Hello10

    	//printf를 배워보자!(println/print -> 줄바꿈 차이
    	System.out.print("정수 입력 : "); //바로 옆에 입력 받음
    	System.out.println("정수 입력 : "); //줄 바꾸고 입력 받음
    	System.out.printf("정수 출력 : %d \n", 1); //1이라는 값이 %d에 들어가서 정수출력:1이 출력됨
    	//\n: 줄바꿔주세요
    	System.out.printf("문자열 출력 : %s", "Hello World"); //문자열은 s!
    }
}

//이클립스에서 줄단위로 삭제하는 방법: ctrl + d