package com.kh.day04.exercise;
//별
//별별
//별별별
//....별10개
public class Exercise_ForDouble3 {
    public static void main(String[] args) {
        //int num = 1;
    	for(int i = 0; i < 10; i++) {  //j줄만큼 별 j개가 출력됨
            for(int j = 0; j < i + 1; j++) { //j줄만큼 별하나가 출력됨★ j<1+i ㅜㅜ
            	
            	System.out.print("*");           	
            }
            System.out.println();
           // num++;
    	  }
    }
}
