package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {

    //	for(;;)
    	while(true) {
    		try {
    			Scanner sc = new Scanner(System.in);
    			System.out.print("정수 하나 입력: ");
    			int num1 = sc.nextInt();
    			System.out.print("정수 하나 더 입력: ");
    			int num2 = sc.nextInt();
    			System.out.println("나눠버리면^^");
    			int result = num1 / num2;
    			System.out.println("몫은 " + result + "입니다~");
    			break; //제대로 썼으면 반복 안되고 0 입력하면 반복되게하는 브레잌
    		} catch(ArithmeticException e){
    			System.out.println("0 안됨. 다시 입력 바람다: ");   		
    	}
    	}
    }
    
	public void practice2() {
		//정수 3개를 입력하세요
		//0>>5
		//1>>R
		//정수가 아닙니다. 다시 입력하세요!
		//1>>4
		//2>>6
		//합은 15
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
		System.out.println("정수 세개 입력하세요 : ");
        for(int i = 0; i < 3; i++) {
        	System.out.print(i + " >>");
        	try {
        		num = sc.nextInt();
        	}catch(InputMismatchException e) {
        	      System.out.println("정수 아닙니다. 다시 입력하셍: ");	
        	      sc.next(); //입력한 이상한글자 제거
        	      i--; //이게 있어야 잘못입력한 턴의 똑같은 i에 옳은 숫자 넣을수 있으니까!
        	      continue; //이거 없으면 계속 더해버림. 잘못입력했을때 sum += num; 스킵하게 하기
        	} //[컨티뉴 = 이 밑에건 실행하지 마세요!] 의 뜻
        	sum += num;
        }
        System.out.println("합은 " + sum);		
		
		
	}
}
