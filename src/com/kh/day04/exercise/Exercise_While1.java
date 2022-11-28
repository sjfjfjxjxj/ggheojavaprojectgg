package com.kh.day04.exercise;
//While문을 이용하여 1~100 사이 홀수의 합을 출력
public class Exercise_While1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 100) {
    	    sum = sum + i;
    	   // i = i + 2;
    	    i += 2; //위에거랑 같음. 복합대입연산자. 
    	    //i = i * 2 -> i *= 2;
        }
        System.out.println("합계 : " + sum);
    }
}
