package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {
    public static void main(String[] args) {
    	Random rand = new Random();
    	for(int i = 0; i <50; i++) {
    		System.out.println(rand.nextInt(10)+1);
    	//nextInt(10)->10 미만(0~9)의 랜덤한 숫자가 50번 반복됨 
        //nextInt(10)+1> 1~10까지의 숫자!
        //nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴!
    	//1부터 10까지의 수 중에 랜덤한 수를 뽑고싶으면
    	//nextInt(n)+1, 즉 +1로 범위 조정!
    	//ex. 20부터 35 사이의 수 중에 랜덤뽑기: nextInt(16)+20??? 맞넹
    	//ex2. 10부터 23 사이 랜덤뽑기: nextInt(14)+10
    	}//1~45 : 45+1
    }
}
