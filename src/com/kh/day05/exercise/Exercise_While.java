package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
    public void exercise1(){
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
    public void exercise2() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("1~9사이의 정수를 입력해 주세요 : ");
			int input = sc.nextInt();
			if (input >= 1 && input <= 9) {
				int i = 1;
				while (i <= 9) {
					System.out.println(input + " * " + i + " = " + input * i);
					i++;  //☆☆중요!! 잘 빼먹는것. 안써주면 무한으로 나오거나 출력이 안됨
				}
			} else {
				System.out.println("1~9 사이의 정수가 아니예요. 다시 한 번 입력하세요.");
			}
		}
    }
    public void exercise3() {
        int sum = 0;     
        int input = 0;
        while (input != -1) { //num!=1이면 계속 돈다!
        	Scanner sc = new Scanner(System.in);
        	System.out.print("정수를 입력해 주세요."); // 입력값이 -1인지 계속 체크한다
        	input = sc.nextInt();
        	if(input != -1) {
        		sum = sum + input; // -> sum += input        		
        	}
        } 
        /*while(true) {
    		System.out.print("정수 하나 입력 : ");
    		input = sc.nextInt();
    		if(input == -1) break;
    	}*/ 
    	//sum += input;
        System.out.println("입력한 수의 합은 : " + sum);
    }
}
