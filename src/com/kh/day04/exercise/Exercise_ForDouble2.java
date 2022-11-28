package com.kh.day04.exercise;
//0시0분부터 23시 59분까지 출력하기
//이건 잘 나온다ㅠㅠ
public class Exercise_ForDouble2 {
    public static void main(String[] args) {
    	int clock = 0;
    	int minute = 0;
    	for(clock = 0; clock < 24; clock++) {
    		for(minute = 0; minute < 60; minute++) {
    			//System.out.println(clock + " 시 " + minute +" 분");
    			System.out.printf("%2d시 %2d분\n", clock, minute); //두자릿수씩 띄어서 정렬하고 개행
    			//개발할땐 잘 안씀(css영역)
    		}
    	}
    }
}
