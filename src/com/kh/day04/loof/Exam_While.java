package com.kh.day04.loof;

public class Exam_While {
    public static void main(String[] args) {
        int i = 0; //반드시 와일 바깥으로 빼기
    	while (i < 10) {
    		System.out.print(i);
    		i++; //반복 작업은 중괄호 안에서 실행!
    	}
    	System.out.println(); //개행(줄바꾸기)
    	int j = 9;
    	while(j>=0) {
    		System.out.print(j);
    		j--;
    	}
    }
}
